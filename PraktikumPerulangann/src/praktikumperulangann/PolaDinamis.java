package praktikumperulangan;

import java.util.Scanner;
//indetitas diri
//NIM : 09040626115
//Nama : Ashari Ismail Rizky Akbar
//Modul Pola Dinamis
public class PolaDinamis {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan tinggi: ");
        int tinggi = input.nextInt();

        for (int i = 1; i <= tinggi; i++) {

            for (int j = tinggi; j > i; j--) {
                System.out.print(" ");
            }

            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
