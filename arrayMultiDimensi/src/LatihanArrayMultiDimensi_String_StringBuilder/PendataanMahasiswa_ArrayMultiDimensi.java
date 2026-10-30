package LatihanArrayMultiDimensi_String_StringBuilder;

public class PendataanMahasiswa_ArrayMultiDimensi {
    public static void main(String[] args) {
        // [3 Prodi] [3 Kelas] [5 Mahasiswa]
        String[][][] dataMahasiswa = new String[3][3][5];

        // Contoh pengisian data
        dataMahasiswa[0][0][0] = "Andi (Prodi 1, Kelas 1, Mhs 1)";
        dataMahasiswa[2][2][4] = "Budi (Prodi 3, Kelas 3, Mhs 5)";

        
        for (int p = 0; p < dataMahasiswa.length; p++) {
            System.out.println("Program Studi " + (p + 1) + ":");
            for (int k = 0; k < dataMahasiswa[p].length; k++) {
                System.out.println("  Kelas " + (k + 1) + ":");
                for (int m = 0; m < dataMahasiswa[p][k].length; m++) {
                    String nama = dataMahasiswa[p][k][m] == null ? "Kosong" : dataMahasiswa[p][k][m];
                    System.out.println("    Mhs " + (m + 1) + ": " + nama);
                }
            }
        }
    }
}
