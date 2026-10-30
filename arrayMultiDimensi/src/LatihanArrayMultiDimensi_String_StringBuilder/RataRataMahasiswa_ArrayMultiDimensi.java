package LatihanArrayMultiDimensi_String_StringBuilder;

public class RataRataMahasiswa_ArrayMultiDimensi {
    public static void main(String[] args) {
        // Baris = Mahasiswa, Kolom = Mata Kuliah
        int[][] nilai = {
            {80, 85, 90, 75},
            {70, 75, 80, 85},
            {90, 95, 85, 88}
        };

        for (int i = 0; i < nilai.length; i++) {
            int total = 0;
            for (int j = 0; j < nilai[i].length; j++) {
                total += nilai[i][j];
            }
            double rataRata = (double) total / nilai[i].length;
            System.out.println("Rata-rata Mahasiswa " + (i + 1) + ": " + rataRata);
        }
    }
}
