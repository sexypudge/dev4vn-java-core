package java1.lab7.act2_3_4;

public class SinhVienBiz extends SinhVien {
    private double diemMarketing;
    private double diemSales;

    public SinhVienBiz(double diemMarketing,double diemSales, String hoTen, String nganh){
        super(hoTen, nganh);
        this.diemMarketing=diemMarketing;
        this.diemSales=diemSales;
    }


    @Override
    double getDiem() {
        return (diemMarketing+diemSales)/2;
    }
    public void dauRa(){
        System.out.println("ho ten: "+hoTen);
        System.out.println("nganh: "+nganh);
        System.out.println("diem marketing: "+diemMarketing);
        System.out.println("diem sales: "+diemSales);
        System.out.println("diem trung binh: "+getDiem());
    }
}
