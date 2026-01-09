package lab10;

public class SinhVien {
    String name;
    ChuyenNganh nganhHoc;

    public SinhVien(String name, ChuyenNganh nganhHoc) {
        this.name = name;
        this.nganhHoc = nganhHoc;
    }

    public void display() {
        System.out.println("Sinh vien: " + name);
        System.out.println("Nganh học: " + nganhHoc);
        switch (nganhHoc) {
            case it:
                System.out.println("Lap trinh");
                break;
            case design:
                System.out.println("Thiet ke do hoa");
                break;
            case marketing:
                System.out.println("chạy quảng cáo");
                break;
            case qtkd:
                System.out.println("kinh doanh");
                break;
        }
    }

    public static void main(String[] args) {
        SinhVien sv1 = new SinhVien("Nguyen Ngoc The", ChuyenNganh.it);
        SinhVien sv2 = new SinhVien("Tran Van A", ChuyenNganh.qtkd);
        SinhVien sv3 = new SinhVien("Pham Thi C", ChuyenNganh.marketing);
        sv1.display();
        sv2.display();
        sv3.display();
    }
}
