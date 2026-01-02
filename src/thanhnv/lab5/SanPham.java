package thanhnv.lab5;

public class SanPham {
    public String tenSp;
    public double giaSp;

    public SanPham(String tenSp, double giaSp){
        this.tenSp=tenSp;
        this.giaSp=giaSp;
    }


    public void xuat(){
        System.out.println("ten sp: "+tenSp+"gia sp: "+giaSp);
    }
}
