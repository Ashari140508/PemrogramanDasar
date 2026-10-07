/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cpmk2;

import java.util.Scanner;

public class ParkirKampus {

   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan jenis kendaraan (motor/mobil): ");
        String jenis = input.nextLine().toLowerCase();
        
        System.out.print("Masukkan lama parkir (jam): ");
        int lama = input.nextInt();
        
        int tarifAwal = 0;
        int tarifTambahan = 0;
        
        if (jenis.equals("motor")) {
            tarifAwal = 2000;
            tarifTambahan = 1000;           
        } else if (jenis.equals("mobil")) {    
            tarifAwal = 5000;
            tarifTambahan = 2000;
        } else {
            System.out.println("Jenis kendaraan tidal valid. ");
            input.close();
            return;
        }    
        int total;        
        if (lama <= 1) {
            total = tarifAwal;
        } else {
            total = tarifAwal + (lama - 1) * tarifTambahan;
        }        
        System.out.println("Total biaya parkir: Rp " + total);        
        input.close();
    }
    
}
