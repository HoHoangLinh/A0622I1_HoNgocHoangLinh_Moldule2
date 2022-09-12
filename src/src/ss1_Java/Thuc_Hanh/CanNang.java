package ss1_Java.Thuc_Hanh;

import java.util.Scanner;

public class CanNang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double height,wight,bmi;
        System.out.println("Nhap so KG?");
        wight = Double.parseDouble(sc.nextLine());
            System.out.println("Nhap Meter?");
        height = Double.parseDouble(sc.nextLine());
        bmi = wight / Math.pow(height,2);

        if (bmi < 18){
            System.out.printf("Underweight");
        } else if (bmi < 25){
            System.out.println("Normal");
        } else if (bmi < 30) {
            System.out.println("Overweight");
        } else if (bmi )
    }
}
