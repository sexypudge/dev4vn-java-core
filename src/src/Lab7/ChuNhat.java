package Lab7;

public class ChuNhat {
    public double dai;
    public double rong;

    public ChuNhat(double dai, double rong){
        this.dai = dai;
        this.rong = rong;
    }

    public double getChuVi(){
        return (dai+rong)*2;
    }
    public double getDienTich(){
        return dai*rong;
    }
    public void xuat(){
        System.out.println("Dài: " + dai);
        System.out.println("Rộng: " + rong);
        System.out.println("Diện tích: " + getDienTich());
        System.out.println("Chu vi: " + getChuVi());
    }
}
