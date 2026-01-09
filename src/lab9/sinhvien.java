package lab9;

import java.util.Scanner;

public class sinhvien {
    private int masv;
    private String hoten;
    private int diem;
    private String xeploai;

    private static final int MASV = 0;
    private static final String HOTEN = "CHUA_CO_TEN";
    private static final int DIEM = 0;
    private static final String XEPLOAI = "CHUA_XEP_LOAI";

    public sinhvien(int masv, String hoten, int diem, String xeploai) {
        this.masv = masv;
        this.hoten = hoten;
        this.diem = diem;
        this.xeploai = xeploai;
    }

    public sinhvien() {
        this(MASV, HOTEN, DIEM, XEPLOAI);
    }

    public int getDiem() {
        return diem;
    }

    public void setDiem(int diem) {
        this.diem = diem;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public int getMasv() {
        return masv;
    }

    public void setMasv(int masv) {
        this.masv = masv;
    }

    public String getXeploai() {
        return xeploai;
    }

    public void setXeploai(String xeploai) {
        this.xeploai = xeploai;
    }

    public void setXeploai() {
        if (diem >= 8) {
            xeploai = "Gioi";
        } else if (diem >= 7) {
            xeploai = "Kha";
        } else if (diem >= 5) {
            xeploai = "Tb";
        } else {
            xeploai = "Kem";
        }
    }

    @Override
    public String toString() {
        return masv + "\t" + hoten + "\t" + diem + "\t" + xeploai + "\n";
    }

    public void nhapdl() {
        Scanner input = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("Nhap msv: ");
                masv = input.nextInt();
                break;
            } catch (Exception e) {
                System.out.println(" nhap du lieu la kieu so");
                input.nextLine();
            }
        }

        System.out.print("Nhap ten: ");
        hoten = input.next();

        while (true) {
            try {
                System.out.print("Nhap diem: ");
                diem = input.nextInt();
                break;
            } catch (Exception e) {
                System.out.println(" nhap dl la kieu so");
                input.nextLine();
            }
        }
    }

    public static void main(String[] args) {
        sinhvien s = new sinhvien();
        s.nhapdl();
        s.setXeploai();
        System.out.println("Sau khi nhap:");
        System.out.println(s);
    }
}
