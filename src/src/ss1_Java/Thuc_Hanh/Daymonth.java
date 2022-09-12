package ss1_Java.Thuc_Hanh;

import java.util.Scanner;

public class Daymonth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so Thang?");
        int month = sc.nextInt();
        String Str;
        switch (month){
            case 2 :
                Str = "Co 28 va 29 ngay";
                break;
            case 1 :
            case 3 :
            case 5 :
            case 7 :
            case 8 :
            case 10 :
            case 12 :
                Str = "Co 30 ngay";
                break;
            case 4 :
            case 6 :
            case 9 :
            case 11 :
                Str = "Co 31 ngay";
            default:
                Str = "";
                break;
        }
        if (Str != ""){
            System.out.printf("Thang '%d' '%s'",month,Str);
        } else {
            System.out.println("Error!");
        }
    }
}
