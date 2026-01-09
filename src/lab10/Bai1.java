package lab10;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {

            System.out.print("nhập a: ");
            int a = sc.nextInt();
            System.out.print("nhập  b: ");
            int b = sc.nextInt();

            System.out.println("Căn bậc 2 của a: " + Math.sqrt(a));

            System.out.println("a mũ b : " + Math.pow(a, b));

            System.out.println("số lớn nhất : " + Math.max(a, b));

            System.out.println("Số nhỏ nhất  " + Math.min(a, b));

        } catch (Exception e) {
            System.out.println(" nhập vào số nguyên hợp lệ!");
        } finally {
            sc.close();
        }
    }
}
