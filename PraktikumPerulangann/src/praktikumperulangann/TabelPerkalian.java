package praktikumperulangan;

import java.util.Scanner;
//indetitas diri
//NIM : 09040626115
//Nama : Ashari Ismail Rizky Akbar
//Modul Case 3
public class TabelPerkalian {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan angka: ");
        int angka = input.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(angka + " x " + i + " = " + (angka * i));
        }
    }
}