package LatihanArrayMultiDimensi_String_StringBuilder;

public class JumlahKata_String {
    public static void main(String[] args) {
        String kalimat = "Belajar pemrograman Java sangat menyenangkan";
        
        String[] kata = kalimat.trim().split("\\s+");
        
        int jumlahKata = kalimat.trim().isEmpty() ? 0 : kata.length;
        System.out.println("Jumlah kata: " + jumlahKata);
    }
}
