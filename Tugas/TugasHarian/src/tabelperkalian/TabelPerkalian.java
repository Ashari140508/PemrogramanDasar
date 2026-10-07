/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tabelperkalian;

import java.util.Scanner;

/**
 *
 * @author ASHARI
 */
public class TabelPerkalian {

    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.print("Masukkan angka: ");
        int angka = input.nextInt();
        System.out.println("Tabel perkalian untuk " +  angka + ":");
        for (int i = 1; i <= 10; i++) {
            int hasil = angka * i;
            System.out.println(angka + " x " + i + " = " + hasil);
            
        }
        input.close();
    }
    
}
