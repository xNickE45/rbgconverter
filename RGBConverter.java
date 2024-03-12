package org.example;

import java.text.DecimalFormat;
import java.util.Scanner;

public class RGBConverter {
    public static String rgbToHex(int r, int g, int b) {
        return String.format("#%02x%02x%02x", r, g, b);
    }

    public static String rgbToDecimal(int r, int g, int b) {
        double fr = (double) r / 255;
        double fg = (double) g / 255;
        double fb = (double) b / 255;
        DecimalFormat dm = new DecimalFormat("#.###");
        String roundedR = dm.format(fr);
        String roundedG = dm.format(fg);
        String roundedB = dm.format(fb);
        return "(" + r + ", " + g + ", " + b + ") (" + roundedR + ", " + roundedG + ", " + roundedB + ")";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of Red (0-255): ");
        int r = scanner.nextInt();
        System.out.print("Enter the value of Green (0-255): ");
        int g = scanner.nextInt();
        System.out.print("Enter the value of Blue (0-255): ");
        int b = scanner.nextInt();

        String hexValue = rgbToHex(r, g, b);
        String decimalValue = rgbToDecimal(r, g, b);

        System.out.println("RGB: " + decimalValue);
        System.out.println("Hexadecimal: " + hexValue);

        scanner.close();
    }
}
