package lab4;

import java.util.Scanner;

public class lab4_fpt {
    public static void main(String[] args) {
        SanPham sp1 = new SanPham();
        SanPham sp2 = new SanPham();

        System.out.println("Nhập thông tin sản phẩm 1 ");
        sp1.nhap();
        System.out.println("Nhập thông tin sản phẩm 2");
        sp2.nhap();
        System.out.println("Thông tin sản phẩm: ");
        sp1.xuat();
        sp2.xuat();


    }
}
class SanPham{
    String tenSpham;
    double gia;
    double giamgia;

    public double getThueNhapKhau(){
        return gia*0.1;

    }
    public void nhap(){
        Scanner sc = new Scanner (System.in);
        System.out.println("Nhập tên sản phẩm: ");
        tenSpham =sc.nextLine();
        System.out.println("Nhập đơn giá: ");
        gia = sc.nextDouble();
        System.out.println("Nhập giảm giá: ");
        giamgia= sc.nextDouble();

    }
    public void xuat(){
        System.out.println("Tên sản phẩm: "+tenSpham);
        System.out.println("Đơn giá: "+gia);
        System.out.println("Giảm giá: "+giamgia);
        System.out.println("Thuế nhập khẩu: "+getThueNhapKhau());
    }
}