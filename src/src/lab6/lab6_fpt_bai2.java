package lab6;
import java.util.Scanner;
import java.util.ArrayList;

public class lab6_fpt_bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<SanPham> list = new ArrayList<>();

        System.out.println("--- NHẬP DANH SÁCH 5 SẢN PHẨM ---");

        for (int i = 0; i < 5; i++) {
            System.out.println("Nhập sản phẩm thứ " + (i + 1) + ":");
            SanPham sp = new SanPham();
            sp.nhap(scanner);
            list.add(sp);
        }

        System.out.println("\n--- CÁC SẢN PHẨM CỦA HÃNG NOKIA ---");
        boolean timThay = false;


        for (SanPham sp : list) {

            if (sp.getHang().equalsIgnoreCase("Nokia")) {
                sp.xuat();
                timThay = true;
            }
        }

        if (!timThay) {
            System.out.println("Không tìm thấy sản phẩm nào của hãng Nokia.");
        }

    }
}


class SanPham {

    private String tenSp;
    private Double donGia;
    private String hang;


    public SanPham() {
    }


    public SanPham(String tenSp, Double donGia, String hang) {
        this.tenSp = tenSp;
        this.donGia = donGia;
        this.hang = hang;
    }


    public String getHang() {
        return hang;
    }


    public void nhap(Scanner scanner) {
        System.out.print("Nhập tên sản phẩm: ");
        this.tenSp = scanner.nextLine();

        System.out.print("Nhập giá sản phẩm: ");
        this.donGia = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Nhập hãng sản xuất: ");
        this.hang = scanner.nextLine();
    }


    public void xuat() {
        System.out.println("Tên: " + this.tenSp + " | Giá: " + this.donGia + " | Hãng: " + this.hang);
    }
}
