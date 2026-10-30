package LatihanArrayMultiDimensi_String_StringBuilder;

public class HapusSpasi_StringBuilder {
    public static void main(String[] args) {
        String kalimat = "B e l a j a r J a v a";
        StringBuilder sb = new StringBuilder(kalimat);

        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) == ' ') {
                sb.deleteCharAt(i);
                i--; 
            }
        }
        System.out.println("Hasil: " + sb.toString());
    }
}
