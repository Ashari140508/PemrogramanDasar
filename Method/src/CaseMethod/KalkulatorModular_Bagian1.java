package CaseMethod;

import java.util.Scanner;

public class KalkulatorModular_Bagian1 {

    public static int tampilkanMenu(Scanner sc) {
        System.out.println("\n=== Kalkulator ===");
        System.out.println("1. Tambah\n2. Kurang\n3. Kali\n4. Bagi");
        System.out.print("Pilih operasi: ");
        return sc.nextInt();
    }

    public static double hitung(int pilihan, double a, double b) {
        switch (pilihan) {
            case 1: return a + b;
            case 2: return a - b;
            case 3: return a * b;
            case 4: return (b != 0) ? (a / b) : 0;
            default: return 0;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pilihan = tampilkanMenu(sc);
        
        if (pilihan >= 1 && pilihan <= 4) {
            System.out.print("Masukkan angka pertama: ");
            double a = sc.nextDouble();
            System.out.print("Masukkan angka kedua: ");
            double b = sc.nextDouble();
            
            double hasil = hitung(pilihan, a, b);
            System.out.println("Hasil: " + hasil);
        } else {
            System.out.println("Pilihan salah!");
        }
    }
}
