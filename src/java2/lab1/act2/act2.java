package java2.lab1.act2;

import java.util.Scanner;

public class act2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap a: ");
        double a = sc.nextDouble();
        System.out.print("Nhap b: ");
        double b = sc.nextDouble();
        System.out.print("Nhap c: ");
        double c = sc.nextDouble();

        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    System.out.println(" vo so nghiem");
                } else {
                    System.out.println("vo nghiem");
                }
            } else {
                double x = -c / b;
                System.out.println("nghiem x = " + x);
            }
        } else {
            double d = b * b - 4 * a * c;

            if (d < 0) {
                System.out.println("vo nghiem");
            } else if (d == 0) {
                double x = -b / (2 * a);
                System.out.println("nghiem kep x = " + x);
            } else {
                double x1 = (-b + Math.sqrt(d)) / (2 * a);
                double x2 = (-b - Math.sqrt(d)) / (2 * a);
                System.out.println("co 2 nghiem:");
                System.out.println("x1 = " + x1);
                System.out.println("x2 = " + x2);
            }
        }
        sc.close();
    }
}
