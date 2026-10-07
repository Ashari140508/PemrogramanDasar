package praktikumperulangan;

import java.util.Scanner;
//indetitas diri
//NIM : 09040626115
//Nama : Ashari Ismail Rizky Akbar
//Modul Case 1 
public class TugasBilangan {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan n: ");
        int n = input.nextInt();

        System.out.println("\nBilangan 1 sampai " + n + ":");
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }

        System.out.println("\n\nBilangan genap:");
        for (int i = 2; i <= n; i += 2) {
            System.out.print(i + " ");
        }

        System.out.println("\n\nBilangan ganjil:");
        for (int i = 1; i <= n; i += 2) {
            System.out.print(i + " ");
        }
    }
}