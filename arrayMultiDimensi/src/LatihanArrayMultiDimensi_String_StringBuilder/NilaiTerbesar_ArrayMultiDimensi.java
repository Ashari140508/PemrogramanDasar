package LatihanArrayMultiDimensi_String_StringBuilder;

public class NilaiTerbesar_ArrayMultiDimensi {
    public static void main(String[] args) {
        int[][] matriks = {
            {10, 45, 23},
            {89, 12, 56},
            {34, 99, 7}
        };

        int max = matriks[0][0];
        int baris = 0, kolom = 0;

        for (int i = 0; i < matriks.length; i++) {
            for (int j = 0; j < matriks[i].length; j++) {
                if (matriks[i][j] > max) {
                    max = matriks[i][j];
                    baris = i;
                    kolom = j;
                }
            }
        }
        System.out.println("Nilai terbesar: " + max + " pada baris " + baris + " kolom " + kolom);
    }
}
