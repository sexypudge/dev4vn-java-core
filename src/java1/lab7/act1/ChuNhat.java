package java1.lab7.act1;

public class ChuNhat {
    protected double rong;
    protected double dai;

    public ChuNhat(double dai, double rong){
        this.dai=dai;
        this.rong=rong;
    }

    public double getChuVi(){
        return 2*(dai+rong);
    }

    public double getDienTich(){
        return dai*rong;
    }

    public void xuat(){
        System.out.println("hinh chu nhat");
        System.out.println("chieu dai la: "+dai);
        System.out.println("chieu rong la: "+rong);
        System.out.println("chu vi hinh chu nhat la: "+getChuVi());
        System.out.println("dien tich hinh chu nhat la: "+getDienTich());
    }
}
