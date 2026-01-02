package thanhnv.lab4;


public class TaoSanPham {
    public static void main(String[] args) {


        SanPham sp1 = new SanPham("sua cho cho", 20000, 0);
        SanPham sp2 = new SanPham("hat de cuoi",40000);

//        System.out.println("nhap thong tin san pham 1: ");
//        sp1.nhap();
//
//        System.out.println("nhap thong tin san Pham 2: ");
//        sp2.nhap();

        System.out.println("thong tin san pham 1 la:");
        sp1.xuat();

        System.out.println("thong tin san pham 2 la:");
        sp2.xuat();
    }
}
