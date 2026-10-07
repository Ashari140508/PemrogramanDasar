/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package praktikum.bab.pkg3;

import java.util.Scanner;
//indetitas diri
//NIM : 09040626115
//Nama : Ashari Ismail Rizky Akbar
//Modul Praktikum BAB 3

public class PraktikumBAB3 {
    public static void main(String[] args) {
       Scanner input = new Scanner (System.in);
       System.out.println("Total beras (kg): ");
       int totalBeras = input.nextInt();
       System.out.println("Beras per keluarga (kg): ");
       int berasPerKeluarga = input.nextInt();
       int jumlahKeluarga = totalBeras / berasPerKeluarga;
       int sisaBeras = totalBeras % berasPerKeluarga;
       System.out.println("\n=== HASIL DISTRIBUSI ===");
       System.out.println("Jumlah keluarga = " + jumlahKeluarga);
       System.out.println("Sisa beras = " + sisaBeras + " kg");
       input.close();
    }
    
}
