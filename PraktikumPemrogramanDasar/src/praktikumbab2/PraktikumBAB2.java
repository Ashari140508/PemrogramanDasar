/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package praktikum.bab.pkg2;


import java.util.Scanner;

//indetitas diri
//NIM : 09040626115
//Nama : Ashari Ismail Rizky Akbar
//Modul Praktikum BAB 2
public class PraktikumBAB2 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Nama Donatur");
        String nama = input.nextLine();
        System.out.println("Jenis Donatur");
        String jenis = input.nextLine();
        System.out.println("Jumlah Donasi");
        double donasi = input.nextDouble();
        input.nextLine();
        System.out.println("Kode Transaksi");
        String kode = input.nextLine();
        System.out.println("Donasi anonim? (true/false): ");
        boolean anonim = input.nextBoolean();
        System.out.println("\n=== DATA DONASI ===");
        System.out.println("Nama : " + nama);
        System.out.println("Jenis : " + jenis);
        System.out.println("Donasi : Rp" + donasi);
        System.out.println("Kode : " + kode);
        System.out.println("Anonim : " + anonim);
        input.close();
    }
    
}
