package CaseMethod;

import java.util.Scanner;

public class KonversiSuhu_Bagian1 {
    public static double konversiCelsiusKeFahrenheit(double c) {
        return (c * 9 / 5) + 32;
    }

    public static double konversiFahrenheitKeCelsius(double f) {
        return (f - 32) * 5 / 9;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Menu Konversi Suhu:");
        System.out.println("1. Celsius ke Fahrenheit");
        System.out.println("2. Fahrenheit ke Celsius");
        System.out.print("Pilih menu (1/2): ");
        int pilihan = input.nextInt();

        if (pilihan == 1) {
            System.out.print("Masukkan suhu Celsius: ");
            double c = input.nextDouble();
            System.out.println("Fahrenheit: " + konversiCelsiusKeFahrenheit(c));
        } else if (pilihan == 2) {
            System.out.print("Masukkan suhu Fahrenheit: ");
            double f = input.nextDouble();
            System.out.println("Celsius: " + konversiFahrenheitKeCelsius(f));
        } else {
            System.out.println("Pilihan tidak valid.");
        }
    }
}
