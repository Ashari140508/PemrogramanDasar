/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cpmk2;

import java.util.Scanner;
   
public class Zakatmal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan total harta: Rp ");
        double harta = input.nextDouble();
        
        System.out.print("Masukkan nilai nisab: Rp ");
        double nisab = input.nextDouble();
        
        if (harta >= nisab) {
            double zakat = harta * 0.025;
            System.out.println("Zakat ysng harus dibayar: Rp " + zakat);            
        } else {
            System.out.println("Harta belum mencapai nisab.");
        }
        
        input.close();
    }
    
}
