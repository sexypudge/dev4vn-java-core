package Lab8;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập bán kính: ");
        double r = sc.nextDouble();
        double acreage = Math.pow(r, 2) * Math.PI;
        double perimeter = 2 * r * Math.PI;
        System.out.println("chu vi hình tròn: " + perimeter);
        System.out.println("Diện tihcs hình tròn: " + acreage);
        sc.close();
    }
}
