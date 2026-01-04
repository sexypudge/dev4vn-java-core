package lab4;
import java.util.Scanner;
public class lab4_fpt_bai4 {
    public static void main(String[] args) {
        SanPham3 sp1 = new SanPham3("iPhone 15", 30000000, 2000000);

        // Thử dùng setter để sửa giá
        sp1.setDonGia(29000000);

        // Thử dùng getter để lấy tên
        System.out.println("Sản phẩm đang kiểm tra: " + sp1.getTenSp());

        sp1.xuat();

    }
}


class SanPham3 {
    // 1. Chuyển thuộc tính sang private [cite: 61]
    private String tenSp;
    private double donGia;
    private double giamGia;

    // Hàm tạo đầy đủ tham số
    public SanPham3(String tenSp, double donGia, double giamGia) {
        this.tenSp = tenSp;
        this.donGia = donGia;
        this.giamGia = giamGia;
    }

    public SanPham3(String tenSp, double donGia) {
        this(tenSp, donGia, 0);
    }

    // 2. Bổ sung Getter và Setter [cite: 61, 68, 71]
    public String getTenSp() {
        return tenSp;
    }

    public void setTenSp(String tenSp) {
        this.tenSp = tenSp;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public double getGiamGia() {
        return giamGia;
    }

    public void setGiamGia(double giamGia) {
        this.giamGia = giamGia;
    }

    private double getThueNhapKhau() {
        return donGia * 0.1;
    }

    public void xuat() {
        System.out.println("Tên SP: " + tenSp);
        System.out.println("Đơn giá: " + donGia);
        System.out.println("Giảm giá: " + giamGia);
        System.out.println("Thuế NK: " + getThueNhapKhau());
        System.out.println("-----------------");
    }
}


