/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package nilaiipk;

import java.util.Scanner;

public class NilaiIPK {
   
    public static void main(String[] args) {
     System.out.println("masukkan nilai ;");
     Scanner input=new Scanner(System.in);
      int nilai = input.nextInt();
      
      if (nilai <0 || nilai >100)
      if((nilai >= 91) && (nilai <= 100)) {
          System.out.println("A");
      } else if ((nilai >= 86) && (nilai <= 90 )) { 
          System.out.println("A-");
      } else if ((nilai >= 81) && (nilai <=85 )) {
          System.out.println("B+");
      } else if ((nilai >= 76) && (nilai <= 80 )) {
          System.out.println("B");
      } else if ((nilai >= 66) && (nilai <= 70 )) {
          System.out.println("C+");
      } else if ((nilai >= 61) && (nilai <= 65 )) {
          System.out.println("C");
      } else if ((nilai >= 56) && (nilai <= 60)) {
          System.out.println("D");
      } else if ((nilai >= 0) && (nilai <= 55)) {
          System.out.println("E");
     
     }
    }
    
}
