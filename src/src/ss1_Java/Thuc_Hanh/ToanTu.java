package ss1_Java.Thuc_Hanh;

import java.util.Scanner;

public class ToanTu {
    public static void main(String[] args) {
        float width,height;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Width : ");
        width = scanner.nextFloat();

        System.out.println("Height : ");
        height = scanner.nextFloat();

        float area = width * height;
        System.out.println("Area : "+ area);
    }
}
