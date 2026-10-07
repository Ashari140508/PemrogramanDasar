/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package array;


public class Arraykehadiranmahasiswa {
    public static void main(String[] args) {
        int[] hadir = {14, 13, 16, 12, 15, 10, 16, 14};
        int totalPertemuan = 16;

        System.out.println("--- Rekap Kehadiran Mahasiswa ---");
        for (int i = 0; i < hadir.length; i++) {
            double persentase = ((double) hadir[i] / totalPertemuan) * 100;
            String status = (persentase >= 75) ? "Memenuhi Syarat" : "Tidak Memenuhi Syarat";
            
            System.out.println("Data ke-" + (i + 1) + ": Hadir " + hadir[i] + " kali " + 
                               "(" + String.format("%.2f", persentase) + "%) - " + status);
        }
    }
}
