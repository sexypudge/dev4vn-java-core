package java1.lab6.act3;

import java.util.Scanner;

public class lab6 {

    static Scanner sc = new Scanner(System.in);

    static boolean checkEmail(String email) {
        return email.matches("\\w+@\\w+(\\.\\w+)+");
    }
    static boolean checkSdt(String sdt){
        return sdt.matches("0\\d{9}");
    }

    static boolean checkCmnd(String cmnd){
        return cmnd.matches("\\d{9}|\\d{12}");
    }
    public static void main(String[] args) {
        SinhVien[] ds = new SinhVien[5];

        for(int i=0;i<5;i++){
            System.out.println("nhap vafo sinh vien:");
            String hoTen = sc.nextLine();
            String email;
            String sdt;
            String cmnd;

            while(true){
                System.out.println("nhap email: ");
                email= sc.nextLine();
                if(checkEmail(email)){
                    break;
                }
                System.out.println("khong hop le");
            }
            while(true){
                System.out.println("nhap sdt: ");
                sdt= sc.nextLine();
                if(checkSdt(sdt)){
                    break;
                }
                System.out.println("khong hop le");
            }
            while(true){
                System.out.println("nhap cmnd: ");
                cmnd= sc.nextLine();
                if(checkCmnd(cmnd)){
                    break;
                }
                System.out.println("khong hop le");
            }
            ds[i]= new SinhVien(hoTen,email,sdt,cmnd);
        }
        System.out.println("danh sach sinh vien");
        for(SinhVien sv : ds){
            sv.xuat();
        }
    }
}
