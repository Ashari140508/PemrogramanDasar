package praktikumperulangan;

import java.util.Scanner;
//indetitas diri
//NIM : 09040626115
//Nama : Ashari Ismail Rizky Akbar
//Modul Case 2
public class Faktorial {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan angka: ");
        int n = input.nextInt();

        int hasil = 1;

        for (int i = n; i >= 1; i--) {
            hasil *= i;
        }

        System.out.println(n + "! = " + hasil);
    }
}