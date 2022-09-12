package ss1_Java.Thuc_Hanh;

import java.util.Scanner;

public class NamNhuan {
    public static void main(String[] args) {
        System.out.println("Nhap Nam?");
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        boolean flag = false;
        if (month % 4 == 0){
            if (month % 100 == 0) {
                if (month % 400 == 0){
                    flag = true;
                }
            }else {
                flag = true;
            }
        }
        if (flag){
            System.out.printf("'%d' Nam nhuan",month);
        } else {
            System.out.printf("'%d'Khong phai nam nhuan",month);
        }


    }
}
