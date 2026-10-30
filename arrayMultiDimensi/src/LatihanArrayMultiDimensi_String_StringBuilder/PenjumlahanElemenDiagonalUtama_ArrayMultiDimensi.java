package LatihanArrayMultiDimensi_String_StringBuilder;

public class PenjumlahanElemenDiagonalUtama_ArrayMultiDimensi {
    public static void main(String[] args) {
        int[][] matriks = {
            {5, 2, 3},
            {4, 8, 6},
            {7, 8, 9}
        };

        int jumlah = 0;
        for (int i = 0; i < matriks.length; i++) {
            jumlah += matriks[i][i]; 
        }
        System.out.println("Jumlah diagonal utama: " + jumlah);
    }
}
