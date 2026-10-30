package latihanmethod;

import java.util.InputMismatchException;
import java.util.Scanner;

public class LatihanMethod {

    static double tambah(double a, double b)   { return a + b; }
    static double kurang(double a, double b)   { return a - b; }
    static double kali(double a, double b)     { return a * b; }

    static double bagi(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Pembagian dengan nol tidak diperbolehkan.");
            return Double.NaN;
        }
        return a / b;
    }
    static double sisaBagi(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Modulo dengan nol tidak diperbolehkan.");
            return Double.NaN;
        }
        return a % b;
    }
    static double pangkat(double a, double b) {
        return Math.pow(a, b);
    }
    static double hitung(int pilihan, double a, double b) {
        switch (pilihan) {
            case 1: return tambah(a, b);
            case 2: return kurang(a, b);
            case 3: return kali(a, b);
            case 4: return bagi(a, b);
            case 5: return sisaBagi(a, b);
            case 6: return pangkat(a, b);
            default: return 0;
        }
    }
    static int bacaInt(Scanner input, String pesan) {
        while (true) {
            try {
                System.out.print(pesan);
                return input.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Error: Input harus berupa angka bulat!");
                input.nextLine(); // Clear buffer
            }
        }
    }
    static int bacaPilihanMenu(Scanner input) {
        int pilihan;
        do {
            pilihan = bacaInt(input, "Pilih menu (0-6): ");
            if (pilihan < 0 || pilihan > 6) {
                System.out.println("Pilihan tidak valid! Masukkan angka antara 0 hingga 6.\n");
            }
        } while (pilihan < 0 || pilihan > 6);
        return pilihan;
    }
    static double bacaDouble(Scanner input, String pesan) {
        while (true) {
            try {
                System.out.print(pesan);
                return input.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("Error: Input harus berupa angka!");
                input.nextLine(); 
            }
        }
    }
    static void tampilkanMenu() {
        System.out.println("=== KALKULATOR MODULAR ===");
        System.out.println("1. Tambah (+)");
        System.out.println("2. Kurang (-)");
        System.out.println("3. Kali (*)");
        System.out.println("4. Bagi (/)");
        System.out.println("5. Sisa Bagi (%)");
        System.out.println("6. Pangkat (^)");
        System.out.println("0. Keluar");
    }
    static void tampilkanHasil(String operasi, double a, double b, double hasil) {
        System.out.println("Hasil: " + a + " " + operasi + " " + b + " = " + hasil);
    }
    static String getSimbolOperasi(int pilihan) {
        switch (pilihan) {
            case 1: return "+";
            case 2: return "-";
            case 3: return "*";
            case 4: return "/";
            case 5: return "%";
            case 6: return "^";
            default: return "";
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilihan;
        do {
            tampilkanMenu();
            pilihan = bacaPilihanMenu(input); 

            if (pilihan >= 1 && pilihan <= 6) {
                double a = bacaDouble(input, "Angka pertama: ");
                double b = bacaDouble(input, "Angka kedua  : ");
                double hasil = hitung(pilihan, a, b);

                if (!Double.isNaN(hasil)) {
                    String operasi = getSimbolOperasi(pilihan);
                    tampilkanHasil(operasi, a, b, hasil);
                }
            }
            System.out.println();
        } while (pilihan != 0);
        System.out.println("Terima kasih.");
        input.close();
    }
}


    

