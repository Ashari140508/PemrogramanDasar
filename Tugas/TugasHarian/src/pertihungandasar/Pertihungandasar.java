/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertihungandasar;

import java.util.Scanner;

public class Pertihungandasar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Pilih operasi matematika:");
        System.out.println("1. Pertambahan");
        System.out.println("2. Pengurangan");
        System.out.println("3. Pembagian");
        System.out.println("Selain 1, 2, 3 = Perkalian");
        System.out.print("Masukkan pilihan: ");
        int pilihan = input.nextInt();
        System.out.print("Masukkan angka pertama: ");
        double angka1 = input.nextDouble();
        System.out.print("Masukkan angka kedua: ");
        double angka2 = input.nextDouble();
        double hasil;
        if (pilihan == 1) {
            hasil = angka1 + angka2;
            System.out.println("Operasi yang dipilih: Pertambahan");
        } 
        else if (pilihan == 2) {
            hasil = angka1 - angka2;
            System.out.println("Operasi yang dipilih: Pengurangan");
        } 
        else if (pilihan == 3) {
            hasil = angka1 / angka2;
            System.out.println("Operasi yang dipilih: Pembagian");
        } 
        else {
            hasil = angka1 * angka2;
            System.out.println("Operasi yang dipilih: Perkalian");
        }
        System.out.println("Hasil = " + hasil);
    }
}
    
    

