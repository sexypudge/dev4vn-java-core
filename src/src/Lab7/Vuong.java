package Lab7;

public class Vuong extends ChuNhat {
    public Vuong(double canh){
        super(canh,canh);
    }

    @Override
    public void xuat() {
        System.out.println("Cạnh: " + dai);
        System.out.println("Diện tích: " + getDienTich());
        System.out.println("Chu vi: " + getChuVi());
    }
}
