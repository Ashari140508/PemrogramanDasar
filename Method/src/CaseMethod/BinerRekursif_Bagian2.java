package CaseMethod;

public class BinerRekursif_Bagian2 {
    public static void cetakBiner(int n) {
        if (n > 1) {
            cetakBiner(n / 2); 
        }
        System.out.print(n % 2); 
    }

    public static void main(String[] args) {
        System.out.print("Biner dari 13: ");
        cetakBiner(13); 
        System.out.println();
    }
}
