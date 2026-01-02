package thanhnv.lab4;
import java.util.Scanner;

public class SanPham {

    private String tenSp;
    private double donGia;
    private double giamGia;
    private double getThueNhapKhau(){
        return donGia*0.1;
    };

    public String getTenSp(){
        return this.tenSp;
    }
    public void setTenSp(String tenSp){
        this.tenSp=tenSp;
    }

    public double getDonGia(){
        return this.donGia;
    }
    public void setDonGia(double donGia){
        this.donGia=donGia;
    }

    public double getGiamGia(){
        return this.giamGia;
    }
    public void setGiamGia(double giamGia){
        this.giamGia=giamGia;
    }

    void xuat(){
        System.out.println("ten san pham la: "+tenSp);
        System.out.println("gia san pham la: "+donGia);
        System.out.println("giam gia: "+ giamGia);
        System.out.println("thue la: "+ getThueNhapKhau());
    };
//    void nhap(){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("nhap ten sp: ");
//        tenSp= sc.nextLine();
//        System.out.println("nhap gia sp: ");
//        donGia =sc.nextDouble();
//    };

    public SanPham(String tenSp, double donGia, double giamGia){
        this.tenSp= tenSp;
        this.donGia= donGia;
        this.giamGia=giamGia;
    };

    public SanPham(String tenSp,double donGia){
        this(tenSp,donGia,0);
    }
}
