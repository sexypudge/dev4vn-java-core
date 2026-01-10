package java2.lab2.act3;
import java.util.Scanner;
public class SinhVien {

    private int masv;
    private String hoten;
    private int diem;
    private String xeploai;

    private static final int DIEM = 0;
    private static final int MASV = 0;
    private static final String HOTEN = "CHUA_CO_TEN";
    private static final String XEPLOAI = "CHUA_XEP_LOAI";

    public SinhVien(int masv, String hoten, int diem, String xeploai) {
        this.masv = masv;
        this.hoten = hoten;
        this.diem = diem;
        this.xeploai = xeploai;
    }

    public SinhVien() {
        this(MASV, HOTEN, DIEM, XEPLOAI);
    }

    public int getMasv() {
        return masv;
    }

    public void setMasv(int masv) {
        this.masv = masv;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public int getDiem() {
        return diem;
    }

    public void setDiem(int diem) {
        this.diem = diem;
        setXeploai();
    }

    public String getXeploai() {
        return xeploai;
    }

    public void setXeploai() {
        if (diem >= 8) {
            xeploai = "Gioi";
        } else if (diem >= 7) {
            xeploai = "Kha";
        } else if (diem >= 5) {
            xeploai = "Trung binh";
        } else {
            xeploai = "Kem";
        }
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("Nhap ma sinh vien: ");
                masv = Integer.parseInt(sc.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("ma sinh vien phai la so nguyen");
            }
        }

        while (true) {
            try {
                System.out.print("Nhap ho ten: ");
                hoten = sc.nextLine();

                if (hoten.trim().isEmpty() || hoten.matches(".*\\d.*")) {
                    throw new Exception();
                }
                break;
            } catch (Exception e) {
                System.out.println("Ho ten khong duoc rong va khong chua so");
            }
        }

        while (true) {
            try {
                System.out.print("Nhap diem: ");
                diem = Integer.parseInt(sc.nextLine());
                setXeploai();
                break;
            } catch (NumberFormatException e) {
                System.out.println("Phai nhap diem bang kieu so");
            }
        }
    }


    @Override
    public String toString() {
        return masv + "\t" + hoten + "\t" + diem + "\t" + xeploai;
    }

    public static void main(String[] args) {
        SinhVien sv = new SinhVien();
        sv.nhap();
        System.out.println(sv);
    }
}