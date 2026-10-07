package javaswitch;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */







import java.util.Scanner;

public class JavaSwitch {

    public static void main(String[] args) {
        System.out.println("masukan pilihan");
        Scanner input=new Scanner(System.in);
        int month = 4;
        switch (month) {
            case 1:
                System.out.println("Januari");
                break;
            case 2:
                System.out.println("Februari");
                break;
            case 3:
                System.out.println("Maret");
            break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("Mei");
                break;
            case 6:
                System.out.println("Juni");
                break;
            case 7:
                System.out.println("Juli");
                break;
            default:
                System.out.println("tidak valid");
                
     
                
                
        }
    }
}
