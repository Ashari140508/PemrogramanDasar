package praktikumperulangan;

import java.util.Scanner;

//indetitas diri
//NIM : 09040626115
//Nama : Ashari Ismail Rizky Akbar
//Modul Studi Kasus Simulasi Tabungan

public class SimulasiTabungan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah bulan: ");
        int bulan = input.nextInt();
        int tabungan = 100000;
        int total = 0;
        for (int i = 1; i <= bulan; i++) {
            System.out.println("Bulan " + i + " = Rp" + tabungan);
            total += tabungan;
            if (total >= 1000000) {
                System.out.println(
                    "Total pertama kali mencapai Rp1.000.000 pada bulan " + i
                );
                break;
            }
            tabungan += 50000;
        }
        System.out.println("Total tabungan = Rp" + total);
    }
}