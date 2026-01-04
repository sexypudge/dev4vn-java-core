package lab7.act2_3_4;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Comparator;


public class lab7 {

    static ArrayList<SinhVienIT> itList = new ArrayList<>();
    static ArrayList<SinhVienBiz> bizList = new ArrayList<>();
    static ArrayList<SinhVien> sinhVienList= new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int chon;
        do {
            menu();
            System.out.println("chon option!");
            chon =sc.nextInt();
            sc.nextLine();
            switch (chon){
                case 1 ->nhap();
                case 2 ->xuat();
                case 3 ->svGioi();
                case 4 ->sapXep();
                case 5 -> System.out.println("ket thuc");
                default -> System.out.println("chon sai");
            }

        }while (chon !=5);

    }

    static public void nhap(){

        System.out.println("nhap danh sach? I or B (I for IT, B for Biz?");
        String nhap = sc.nextLine();
        if (nhap.equals("I") || nhap.equals("i")){
            while (true){
                System.out.println("nhap danh sach");
                System.out.println("nhap ho ten");
                String hoTen = sc.nextLine();
                System.out.println("nhap chuyen nganh ");
                String nganh = sc.nextLine();
                System.out.println("nhap diem java");
                double diemJava = sc.nextDouble();
                System.out.println("nhap diem html");
                double diemHtml = sc.nextDouble();
                System.out.println("nhap diem css");
                double diemCss = sc.nextDouble();
                sc.nextLine();

                itList.add(new SinhVienIT(diemJava,diemCss,diemHtml,hoTen,nganh));

                System.out.println("tiep tuc nhap them sinh vien? Y or N");
                if(sc.nextLine().equalsIgnoreCase("y")){
                    continue;
                }else {
                    break;
                }
            }

        } else if ((nhap.equals("B") || nhap.equals("b"))) {
            while (true){
                System.out.println("nhap danh sach");
                System.out.println("nhap ho ten");
                String hoTen = sc.nextLine();
                System.out.println("nhap chuyen nganh ");
                String nganh = sc.nextLine();
                System.out.println("nhap diem marketing");
                double diemMarketing = sc.nextDouble();
                System.out.println("nhap diem sales");
                double diemSales = sc.nextDouble();
                sc.nextLine();

                bizList.add(new SinhVienBiz(diemMarketing, diemSales,hoTen,nganh));

                System.out.println("tiep tuc nhap them sinh vien? Y or N");
                if(sc.nextLine().equalsIgnoreCase("y")){
                    continue;
                }else {
                    break;
                }
            }

        }else {
            System.out.println("khong hop le");
        }

    }

    static public void xuat(){
        if (itList.isEmpty() && bizList.isEmpty()){
            System.out.println("chua co sinh vien");
        }

        for(SinhVienIT sv: itList){
            sv.dauRa();
            System.out.println(".............");
        }
        for(SinhVienBiz sv: bizList){
            sv.dauRa();
            System.out.println(".............");
        }
    }

    static public void svGioi(){
        System.out.println("sv hoc gioi");
        for(SinhVienIT sv: itList){
            if(sv.getDiem()>=7.5){
                sv.dauRa();
            }else {
                System.out.println("khong co sv it gioi");
            }
        }
        for(SinhVienBiz sv: bizList){
            if(sv.getDiem()>=7.5){
                sv.dauRa();
            }else {
                System.out.println("khong co sv biz gioi");
            }
        }

    }
    static public void sapXep(){
        sinhVienList.clear();
        sinhVienList.addAll(itList);
        sinhVienList.addAll(bizList);

        System.out.println("sap xep sinh vien");

        Comparator<SinhVien>comp = new Comparator<SinhVien>(){

            @Override
            public int compare(SinhVien s1, SinhVien s2){
                return Double.compare(s2.getDiem(), s1.getDiem());
            }
        };
        sinhVienList.sort(comp);
        for (SinhVien sv : sinhVienList) {

            if (sv instanceof SinhVienIT) {
                ((SinhVienIT) sv).dauRa();
            } else if (sv instanceof SinhVienBiz) {
                ((SinhVienBiz) sv).dauRa();
            }

            System.out.println("......");
        }
    }

    static public void menu(){
        System.out.println("menu");
        System.out.println("1. nhap");
        System.out.println("2. info");
        System.out.println("3. sv hoc luc gioi");
        System.out.println("4. sap xep theo diem");
    }


}
