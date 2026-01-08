package lab7;

import java.util.Scanner;

public class lab7_fpt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("- Nhap HCN 1 ---");
        System.out.print("Chieu dai: ");
        double d1 = sc.nextDouble();
        System.out.print("Chieu rong: ");
        double r1 = sc.nextDouble();
        ChuNhat cn1 = new ChuNhat(d1, r1);


        System.out.println("--- Nhap HCN 2 ---");
        System.out.print("Chieu dai: ");
        double d2 = sc.nextDouble();
        System.out.print("Chieu rong: ");
        double r2 = sc.nextDouble();
        ChuNhat cn2 = new ChuNhat(d2, r2);


        System.out.println(" Nhap Hinh Vuong");
        System.out.print("Canh: ");
        double canh = sc.nextDouble();
        ChuNhat vu = new Vuong(canh);


        System.out.println("KET QUA");
        cn1.xuat();
        cn2.xuat();
        vu.xuat();
    }
}

class ChuNhat {
    protected double rong;
    protected double dai;

    public ChuNhat(double dai, double rong) {
        this.dai = dai;
        this.rong = rong;
    }

    public double getChuVi() {
        return (dai + rong) * 2;
    }

    public double getDienTich() {
        return dai * rong;
    }

    public void xuat() {
        System.out.println("HCN: Dai=" + dai + ", Rong=" + rong);
        System.out.println("Dien tich: " + getDienTich());
        System.out.println("Chu vi: " + getChuVi());

    }
}

class Vuong extends ChuNhat {

    public Vuong(double canh) {
        super(canh, canh);
    }

    @Override
    public void xuat() {
        System.out.println("Hinh Vuong: Canh=" + dai);
        System.out.println("Dien tich: " + getDienTich());
        System.out.println("Chu vi: " + getChuVi());

    }
}