package java1.lab6.act2;

import java.util.ArrayList;
import java.util.Scanner;

public class lab6 {

    ArrayList<SanPham> spList = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public void nhap() {
        while (true) {
            System.out.println("nhap vao ten san pham:");
            String tenSp = sc.nextLine();
            System.out.println("nhap vao gia san pham:");
            double donGia = sc.nextDouble();
            System.out.println("nhap vao hang:");
            String hang = sc.nextLine();
            sc.nextLine();

            spList.add(new SanPham(tenSp, donGia, hang));
            System.out.println("tiep hay khong? y or n");
            if (sc.nextLine().equalsIgnoreCase("N")) {
                break;
            }
        }
    }
    public void xuat() {
        for(SanPham sp : spList){
            sp.dauRa();
        }
    }
    public static void main(String[] args) {
        lab6 n = new lab6();
        n.nhap();
        n.xuat();
    }
}
