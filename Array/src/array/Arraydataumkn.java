/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package array;


public class Arraydataumkn {
    public static void main(String[] args) {
        double[] harga = {15000, 25000, 12000, 30000, 45000};
        
        double total = 0;
        double max = harga[0];
        double min = harga[0];

        System.out.println("--- Daftar Harga Produk ---");
        for (int i = 0; i < harga.length; i++) {
            double hargaAkhir = harga[i];
            
            // Aturan diskon 10% untuk harga minimal Rp30.000
            if (harga[i] >= 30000) {
                hargaAkhir = harga[i] - (harga[i] * 0.10);
            }
            
            System.out.println("Produk " + (i + 1) + ": Harga Normal = Rp" + harga[i] + 
                               " | Harga Setelah Diskon = Rp" + hargaAkhir);

            total += harga[i];
            if (harga[i] > max) max = harga[i];
            if (harga[i] < min) min = harga[i];
        }

        double rataRata = total / harga.length;

        System.out.println("\n--- Ringkasan Data Produk ---");
        System.out.println("Total harga (sebelum diskon) = Rp" + total);
        System.out.println("Rata-rata harga = Rp" + rataRata);
        System.out.println("Harga tertinggi = Rp" + max);
        System.out.println("Harga terendah = Rp" + min);
    }
}

