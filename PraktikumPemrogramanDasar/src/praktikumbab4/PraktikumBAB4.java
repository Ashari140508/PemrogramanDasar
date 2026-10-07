/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikumbab4;

import java.util.Scanner;
// Identitas Diri
// NIM : 09040626115
// Nama : Ashari Ismail Rizky Akbar
// Modul Praktikum Bab 4
public class PraktikumBAB4 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("IPK : ");
        double ipk = input.nextDouble();
        System.out.print("Hafalan (juz) : ");
        int hafalan = input.nextInt();
        if (ipk >= 3.25 && hafalan >= 5) {
        System.out.println("Memenuhi syarat beasiswa."
        );
        } else {
        System.out.println("Belum memenuhi syarat beasiswa."
        );
        }
        input.close();
    }
}

