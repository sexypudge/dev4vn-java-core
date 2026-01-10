package java2.lab2.act1_2;

import java.util.Scanner;

public class Vdmang {
    public static void main(String[] args) {
        System.out.println("bat dau nhap 5 phan tu: ");
        Scanner sc = new Scanner(System.in);

        int[] a = new int[5];
        int sum = 0;
        try {
            for (int i = 0; i < a.length; i++) {
                a[i] = sc.nextInt();
                sum += a[i];
            }
            System.out.println("Tong cac phan tu trong mang: " + sum);
            a[5] = sc.nextInt();

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("khong the nhap phan tu thu 6");
        }
        sc.close();
    }
}
