package Bai_Tap_Java;

import java.util.Scanner;

public class Bai_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter temperature in Celsius: ");
        double celsius = sc.nextDouble();

        double fahrenheit = celsiusToFahrenheit(celsius);
        System.out.println(celsius + " Celsius = " + fahrenheit + " Fahrenheit");
    }

    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }
}

