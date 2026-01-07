package lab5;

public class SanPham {
    String ten;
    Double gia;
    public SanPham(String ten, Double gia){
        this.ten=ten;
        this.gia=gia;
    }

    public  void xuat(){
        System.out.println("Tên sp: "+ten);
        System.out.println("Gía sp: "+gia);
    }
}
