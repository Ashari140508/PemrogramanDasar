package CaseMethod;

public class SebelumModular_Bagian2 {
    public static void main(String[] args) {
        double hargaBarang = 100000;
        int jumlah = 3;
        double subtotal = hargaBarang * jumlah;
        double diskon = 0;
        
        if (subtotal > 200000) {
            diskon = subtotal * 0.10;
        }
        
        double setelahDiskon = subtotal - diskon;
        double pajak = setelahDiskon * 0.11;
        double totalAkhir = setelahDiskon + pajak;
        
        System.out.println("Subtotal: " + subtotal);
        System.out.println("Diskon: " + diskon);
        System.out.println("Pajak: " + pajak);
        System.out.println("Total Bayar: " + totalAkhir);
    }
}
