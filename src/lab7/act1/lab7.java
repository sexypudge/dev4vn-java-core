package lab7.act1;

import java.util.Scanner;

public class lab7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("hinh chu nhat");
        System.out.println("chieu dai hinh chu nhat: ");
        double dai = sc.nextDouble();
        System.out.println("chieu rong hinh chu nhat: ");
        double rong = sc.nextDouble();
        ChuNhat chuNhat = new ChuNhat(dai,rong);

        System.out.println("hinh vuong");
        System.out.println("nhap canh hinh vuong:");
        double canh= sc.nextDouble();
        Vuong vuong = new Vuong(canh);

        chuNhat.xuat();
        vuong.xuat();
    }
}
