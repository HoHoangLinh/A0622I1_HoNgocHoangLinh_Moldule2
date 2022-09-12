package ss1_Java.Thuc_Hanh;


import java.util.Scanner;

public class Ptrinh {
     public static void main(String[] args) {
          System.out.println("a * x + b = c");

          Scanner scanner = new Scanner(System.in);
          System.out.println("A :");
          double a = Double.parseDouble(scanner.nextLine());
          System.out.println("B :");
          double b = Double.parseDouble(scanner.nextLine());
          System.out.println("C :");
          double c = Double.parseDouble(scanner.nextLine());


          if (a != 0){
               double d = (c - b) /a;
               System.out.println("Equation x = " + d);
          }else {
               if (b == c) {
                    System.out.println("B = c");
               } else {
                    System.out.println("B ko bang C");
               }
          }
     }
}
