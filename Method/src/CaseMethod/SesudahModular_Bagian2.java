package CaseMethod;

public class SesudahModular_Bagian2 {

    public static double hitungDiskon(double subtotal) {
        if (subtotal > 200000) {
            return subtotal * 0.10;
        }
        return 0;
    }

    public static double hitungPajak(double nominal) {
        return nominal * 0.11;
    }

    public static void cetakStruk(double subtotal, double diskon, double pajak, double total) {
        System.out.println("Subtotal: " + subtotal);
        System.out.println("Diskon: " + diskon);
        System.out.println("Pajak: " + pajak);
        System.out.println("Total Bayar: " + total);
    }

    public static void main(String[] args) {
        double hargaBarang = 100000;
        int jumlah = 3;
        
        double subtotal = hargaBarang * jumlah;
        double diskon = hitungDiskon(subtotal);
        double setelahDiskon = subtotal - diskon;
        double pajak = hitungPajak(setelahDiskon);
        double totalAkhir = setelahDiskon + pajak;
        
        cetakStruk(subtotal, diskon, pajak, totalAkhir);
    }
}
