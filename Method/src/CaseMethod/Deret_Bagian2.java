package CaseMethod;

public class Deret_Bagian2 {
    // Versi Rekursif
    public static int jumlahDeretRekursif(int n) {
        if (n == 1) return 1;
        return n + jumlahDeretRekursif(n - 1);
    }

    // Versi Perulangan
    public static int jumlahDeretIteratif(int n) {
        int jumlah = 0;
        for (int i = 1; i <= n; i++) {
            jumlah += i;
        }
        return jumlah;
    }

    public static void main(String[] args) {
        System.out.println("Rekursif (n=5): " + jumlahDeretRekursif(5));
        System.out.println("Iteratif (n=5): " + jumlahDeretIteratif(5));
    }
}
