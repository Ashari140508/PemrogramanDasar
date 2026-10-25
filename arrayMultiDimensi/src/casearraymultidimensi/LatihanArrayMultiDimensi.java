package casearraymultidimensi;

import java.util.Scanner;

public class LatihanArrayMultiDimensi {
   static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("=== SISTEM PENDATAAN MAHASISWA ===");
        
 
        int jumlahProdi = inputUkuran("Masukkan jumlah Program Studi: ");
        int jumlahKelas = inputUkuran("Masukkan jumlah Kelas per Prodi: ");
        int jumlahMahasiswa = inputUkuran("Masukkan jumlah Mahasiswa per Kelas: ");
        

        System.out.println("\n--- Input Data Program Studi ---");
        String[] daftarProdi = inputData1D(jumlahProdi, "Program Studi");
        
        System.out.println("\n--- Input Data Kelas ---");
        String[] daftarKelas = inputData1D(jumlahKelas, "Kelas");
        
  
        System.out.println("\n--- Input Data Mahasiswa ---");
        String[][][] namaMahasiswa = inputDataMahasiswa(jumlahProdi, jumlahKelas, jumlahMahasiswa, daftarProdi, daftarKelas);
        

        tampilkanData(daftarProdi, daftarKelas, namaMahasiswa);
        

        operasiString(namaMahasiswa);
        
        System.out.println("\nProgram selesai. Terima kasih!");
    }

    
    public static int inputUkuran(String pesan) {
        System.out.print(pesan);
        int ukuran = input.nextInt();
        input.nextLine(); 
        return ukuran;
    }


    public static String[] inputData1D(int ukuran, String tipe) {
        String[] data = new String[ukuran];
        for (int i = 0; i < ukuran; i++) {
            System.out.print("Masukkan nama " + tipe + " ke-" + (i + 1) + ": ");
            data[i] = input.nextLine();
        }
        return data;
    }


    public static String[][][] inputDataMahasiswa(int jmlProdi, int jmlKelas, int jmlMhs, String[] prodi, String[] kelas) {
        String[][][] data = new String[jmlProdi][jmlKelas][jmlMhs];
        
        for (int i = 0; i < jmlProdi; i++) {
            System.out.println(">> Prodi: " + prodi[i]);
            for (int j = 0; j < jmlKelas; j++) {
                System.out.println("   Kelas: " + kelas[j]);
                for (int k = 0; k < jmlMhs; k++) {
                    System.out.print("      Nama Mahasiswa ke-" + (k + 1) + ": ");
                    data[i][j][k] = input.nextLine();
                }
            }
        }
        return data;
    }

 
    public static void tampilkanData(String[] prodi, String[] kelas, String[][][] mahasiswa) {
        System.out.println("\n======================================");
        System.out.println("        REKAP DATA MAHASISWA          ");
        System.out.println("======================================");
        
        for (int i = 0; i < mahasiswa.length; i++) {
            System.out.println("Program Studi : " + prodi[i].toUpperCase()); 
            for (int j = 0; j < mahasiswa[i].length; j++) {
                System.out.println("  [" + kelas[j] + "]");
                for (int k = 0; k < mahasiswa[i][j].length; k++) {
                    System.out.println("    " + (k + 1) + ". " + mahasiswa[i][j][k]);
                }
            }
            System.out.println("--------------------------------------");
        }
    }


    public static void operasiString(String[][][] mahasiswa) {
        System.out.println("\n=== FITUR OPERASI STRING ===");
        System.out.print("Masukkan nama/potongan huruf yang ingin dicari: ");
        String keyword = input.nextLine();
        
        int totalDitemukan = 0;
        int totalKarakterTerpanjang = 0;
        String namaTerpanjang = "";

        System.out.println("\nHasil Pencarian & Analisis String:");
        
        for (int i = 0; i < mahasiswa.length; i++) {
            for (int j = 0; j < mahasiswa[i].length; j++) {
                for (int k = 0; k < mahasiswa[i][j].length; k++) {
                    String nama = mahasiswa[i][j][k];
                    

                    if (nama.length() > totalKarakterTerpanjang) {
                        totalKarakterTerpanjang = nama.length();
                        namaTerpanjang = nama;
                    }


                    if (nama.toLowerCase().contains(keyword.toLowerCase())) {
                        System.out.println("- Ditemukan kecocokan: " + nama);
                        System.out.println("  (Total karakter: " + nama.length() + " huruf)");
                        totalDitemukan++;
                    }
                    

                    if (nama.equalsIgnoreCase(keyword)) {
                        System.out.println("  *** Nama \"" + nama.toUpperCase() + "\" adalah KECOCOKAN PERSIS (Exact Match) ***");
                    }
                }
            }
        }
        
        System.out.println("\nRingkasan Analisis:");
        System.out.println("1. Jumlah data yang memuat kata '" + keyword + "' : " + totalDitemukan + " mahasiswa");
        System.out.println("2. Nama paling panjang dalam sistem : " + namaTerpanjang + " (" + totalKarakterTerpanjang + " huruf)");
    }
}