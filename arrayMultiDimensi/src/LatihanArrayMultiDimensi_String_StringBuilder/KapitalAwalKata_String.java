package LatihanArrayMultiDimensi_String_StringBuilder;

public class KapitalAwalKata_String {
    public static void main(String[] args) {
        String kalimat = "halo dunia pemrograman";
        String[] kata = kalimat.split(" ");
        String hasil = "";

        for (String k : kata) {
            if (k.length() > 0) {
                hasil += k.substring(0, 1).toUpperCase() + k.substring(1).toLowerCase() + " ";
            }
        }
        System.out.println("Hasil: " + hasil.trim());
    }
}
