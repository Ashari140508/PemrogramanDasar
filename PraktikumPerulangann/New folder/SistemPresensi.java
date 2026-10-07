package praktikumperulangan;

import java.util.Scanner;
//indetitas diri
//NIM : 09040626115
//Nama : Ashari Ismail Rizky Akbar
//Modul Studi Kasus Presensi
public class SistemPresensi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int hadir = 0;
        int tidakHadir = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.print("Mahasiswa ke-" + i + " (1=Hadir, 0=Tidak Hadir): ");
            int status = input.nextInt();
            if (status == 1) {
                hadir++;
            } else if (status == 0) {
                tidakHadir++;
            } else {
                System.out.println("Input tidak valid.");
                i--;
            }
        }
        double persentase = (hadir / 10.0) * 100;
        System.out.println("\nJumlah hadir = " + hadir);
        System.out.println("Jumlah tidak hadir = " + tidakHadir);
        System.out.println("Persentase kehadiran = " + persentase + "%");
        if (persentase >= 75) {
            System.out.println("Memenuhi syarat");
        } else {
            System.out.println("Tidak memenuhi syarat");
        }
    }
}