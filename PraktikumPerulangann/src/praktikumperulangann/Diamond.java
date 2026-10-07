package praktikumperulangan;

//indetitas diri
//NIM : 09040626115
//Nama : Ashari Ismail Rizky Akbar
//Modul Studi Kasus HOTS Diamond

public class Diamond {
    public static void main(String[] args) {
        // Bagian atas
        for (int i = 1; i <= 5; i++) {

            for (int j = 5; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // Bagian bawah
        for (int i = 4; i >= 1; i--) {

            for (int j = 5; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
