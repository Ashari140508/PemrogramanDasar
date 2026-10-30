package CaseMethod;

public class OverLoadRataRata_Bagian2 {
    public static double rataRata(double a, double b) {
        return (a + b) / 2.0;
    }

    public static double rataRata(double a, double b, double c) {
        return (a + b + c) / 3.0;
    }

    public static void main(String[] args) {
        System.out.println("Rata-rata 2 bilangan (10, 20): " + rataRata(10, 20));
        System.out.println("Rata-rata 3 bilangan (10, 20, 30): " + rataRata(10, 20, 30));
    }
}
