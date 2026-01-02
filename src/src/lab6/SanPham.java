package lab6;

import java.util.Scanner;

public class SanPham {
    String tenSp;
    double gia;
    String hang;
    Scanner sc = new Scanner(System.in);
    void nhap() {
        System.out.print("Tên sản phẩm: ");
        tenSp = sc.nextLine();

        System.out.print("Giá: ");
        gia = Double.parseDouble(sc.nextLine());

        System.out.print("Hãng: ");
        hang = sc.nextLine();
    }

    void xuat() {
        System.out.println("Tên sp: " + tenSp + " | Giá: " + gia + " | Hãng: " + hang);
    }
}
