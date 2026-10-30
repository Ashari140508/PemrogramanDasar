package LatihanArrayMultiDimensi_String_StringBuilder;

public class TransposeMatriks_ArrayMultiDimensi {
    public static void main(String[] args) {
        int[][] matriks = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println("Hasil Transpose:");
        for (int i = 0; i < matriks[0].length; i++) {
            for (int j = 0; j < matriks.length; j++) {
                
                System.out.print(matriks[j][i] + " ");
            }
            System.out.println();
        }
    }
}
