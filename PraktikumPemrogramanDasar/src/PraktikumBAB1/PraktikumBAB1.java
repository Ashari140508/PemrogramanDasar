/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package PraktikumBAB1;

import java.util.Scanner;
//indetitas diri
//NIM : 09040626115
//Nama : Ashari Ismail Rizky Akbar
//Modul Praktikum BAB 1
public class PraktikumBAB1 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Jumlah Mahasiswa");
        int jumlahMahasiswa = input.nextInt();
        System.out.println("Frekuensi Wudhu");
        int frekuensiWudhu = input.nextInt();
        System.out.println("Air Per Wudhu (liter) : ");
        double airPerWudhu = input.nextDouble();
        double totalAir = jumlahMahasiswa * frekuensiWudhu * airPerWudhu;
        double penghematan = totalAir * 15 / 100;
        double totalAirSetelahHemat = totalAir - penghematan;
        System.out.println("\n=== HASIL ===");
        System.out.println("Total kebutuhan air sebelum penghematan =" 
                + totalAir  + " liter");
        System.out.println("Air yang dihemat = " 
                + penghematan + " liter");
        System.out.println("Total kebutuhan air setelah penghematan 15% = " 
                + totalAirSetelahHemat + " liter");
        input.close();
    }
    
}
