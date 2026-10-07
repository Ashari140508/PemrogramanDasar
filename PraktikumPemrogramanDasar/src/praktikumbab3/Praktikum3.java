/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikumbab3;

import java.util.Scanner;
//identitas diri
//nim : 09040626115
//nama : Ashari Ismail Rizky Akbar
//model pratikum bab 3
public class Praktikum3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Total beras (kg): ");
        int totalBeras = input.nextInt();
        
        System.out.print("Jumlah keluarga penerima: ");
        int jumlahKeluarga = input.nextInt();
        int berasPerKeluarga = totalBeras / jumlahKeluarga;
        int sisaBeras = totalBeras % jumlahKeluarga;
        System.out.println("\n=== HASIL PEMBAGIAN BERAS ===");
        System.out.println("Beras per keluarga = "
                + berasPerKeluarga + " kg");
        System.out.println("Sisa beras = "
                + sisaBeras + " kg");
        int sisaDalamGram = sisaBeras * 1000;
        int tambahanGram = sisaDalamGram / jumlahKeluarga;
        System.out.println("Tambahan per keluarga = "
                + tambahanGram + " gram");
        input.close();
    }
}

