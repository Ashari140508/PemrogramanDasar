package LatihanArrayMultiDimensi_String_StringBuilder;

public class PerbandinganWaktu_StringBuilder {
    public static void main(String[] args) {
        int iterasi = 100000;

        // Uji coba menggunakan String +=
        long startTimeString = System.nanoTime();
        String s = "";
        for (int i = 0; i < iterasi; i++) {
            s += i;
        }
        long endTimeString = System.nanoTime();
        long durasiString = endTimeString - startTimeString;

        // Uji coba menggunakan StringBuilder
        long startTimeBuilder = System.nanoTime();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < iterasi; i++) {
            sb.append(i);
        }
        long endTimeBuilder = System.nanoTime();
        long durasiBuilder = endTimeBuilder - startTimeBuilder;

        System.out.println("Waktu String (nano detik): " + durasiString);
        System.out.println("Waktu StringBuilder (nano detik): " + durasiBuilder);
        System.out.println("StringBuilder " + (durasiString / durasiBuilder) + " kali lebih cepat.");
    }
}
