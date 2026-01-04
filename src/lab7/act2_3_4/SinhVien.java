package lab7.act2_3_4;

public abstract class SinhVien {
    protected String hoTen;
    protected String nganh;

    public SinhVien(String hoTen, String nganh){
        this.hoTen=hoTen;
        this.nganh=nganh;
    }

    abstract double getDiem();

    public String getHocLuc(){

        double diem = getDiem();
        if (diem>=0 && diem<5 ){
            return "yeu";
        } else if (diem>=5 && diem<6.5) {
            return "trung binh";
        } else if (diem>=6.5 && diem<7.5) {
            return "kha";
        } else if (diem>=7.5 && diem<9) {
            return "gioi";
        } else if (diem>=9 && diem<=10) {
            return "xuat sac";
        }else {
            return "khong hop le";
        }

    }

}
