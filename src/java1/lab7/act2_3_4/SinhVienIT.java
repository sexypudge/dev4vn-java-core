package java1.lab7.act2_3_4;

public class SinhVienIT extends SinhVien {

    private double diemJava;
    private double diemCss;

    private double diemHtml;


    public SinhVienIT(double diemJava,double diemCss,double diemHtml,String hoTen, String nganh ){
        super(hoTen,nganh);
        this.diemJava=diemJava;
        this.diemHtml=diemHtml;
        this.diemCss=diemCss;
    }




    @Override
    double getDiem() {
        return (diemCss+diemHtml+diemJava)/3;
    }

    public void dauRa(){
        System.out.println("ho ten: "+hoTen);
        System.out.println("nganh: "+nganh);
        System.out.println("diem java: "+diemJava);
        System.out.println("diem css: "+diemCss);
        System.out.println("diem html: "+diemHtml);
        System.out.println("diem trung binh: "+getDiem());
    }
}
