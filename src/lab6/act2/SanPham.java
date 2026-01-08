package lab6.act2;


public class SanPham {

    public String tenSp;
    public double donGia;
    public String hang;



    public SanPham(String tenSp, double donGia, String hang) {
        this.tenSp = tenSp;
        this.donGia = donGia;
        this.hang = hang;
    }

    public SanPham() {

    }

    public void dauRa() {
        System.out.println("ten san pham: " + tenSp);
        System.out.println("gia san pham: " + donGia);
        System.out.println("hang~: " + hang);
    }
}
