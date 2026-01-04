package lab4;

public class lab4_fpt_bai3 {
    public static void main(String[] args) {

        SanPham2 sp1 = new SanPham2("Laptop Dell", 15000000, 1000000);


        SanPham2 sp2 = new SanPham2("Chuột Logitech", 200000);

        sp1.xuat();
        sp2.xuat();
    }
}

class SanPham2 {
        String tenSp;
        double donGia;
        double giamGia;


        public SanPham2(String tenSp, double donGia, double giamGia) {
            this.tenSp = tenSp;
            this.donGia = donGia;
            this.giamGia = giamGia;
        }


        public SanPham2(String tenSp, double donGia) {
            this(tenSp, donGia, 0);
        }


        private double getThueNhapKhau() {
            return donGia * 0.1;
        }


        public void xuat() {
            System.out.println("Tên: " + tenSp + " | Giá: " + donGia + " | Giảm: " + giamGia + " | Thuế: " + getThueNhapKhau());
        }
    }





