package praktikumperulangan;

//indetitas diri
//NIM : 09040626115
//Nama : Ashari Ismail Rizky Akbar
//Modul Studi Kasus Pola Segitiga Rata Kanan

public class SegitigaKanan {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {

            for (int j = 5; j > i; j--) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}