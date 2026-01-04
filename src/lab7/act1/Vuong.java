package lab7.act1;

public class Vuong extends ChuNhat {

    public Vuong(double canh){
        super(canh, canh);
    }
    @Override
    public void xuat(){
        System.out.println("hinh vuong");
        System.out.println("canh: "+dai);
        System.out.println("chu vi hinh chu nhat la: "+getChuVi());
        System.out.println("dien tich hinh chu nhat la: "+getDienTich());
    }
}

