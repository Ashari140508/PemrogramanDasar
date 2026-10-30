package CaseMethod;

public class LuasLingkaran_Bagian1 {
    public static double luasLingkaran(double jariJari) {
        return Math.PI * jariJari * jariJari;
    }

    public static void main(String[] args) {
        System.out.println("Luas untuk r = 7   : " + luasLingkaran(7));
        System.out.println("Luas untuk r = 10  : " + luasLingkaran(10));
        System.out.println("Luas untuk r = 2.5 : " + luasLingkaran(2.5));
    }
}
