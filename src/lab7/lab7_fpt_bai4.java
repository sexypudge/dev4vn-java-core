package lab7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

abstract class SinhVienPoly {
    protected String hoTen;
    protected String nganh;

    public SinhVienPoly(String hoTen, String nganh) {
        this.hoTen = hoTen;
        this.nganh = nganh;
    }

    public abstract double getDiem();

    public String getHocLuc() {
        double diem = getDiem();
        if (diem < 5) return "Yếu";
        if (diem < 6.5) return "Trung bình";
        if (diem < 7.5) return "Khá";
        if (diem < 9) return "Giỏi";
        return "Xuất sắc";
    }

    public void xuat() {

        System.out.println("Họ tên: " + this.hoTen);
        System.out.println("Ngành : " + this.nganh);
        System.out.println("Điểm  : " + this.getDiem());
        System.out.println("Học lực: " + this.getHocLuc());
    }
}

class SinhVienIT extends SinhVienPoly {
    private final double java;
    private final double html;
    private final double css;

    public SinhVienIT(String hoTen, double java, double html, double css) {
        super(hoTen, "IT");
        this.java = java;
        this.html = html;
        this.css = css;
    }

    @Override
    public double getDiem() {
        return (2 * java + html + css) / 4;
    }
}

class SinhVienBiz extends SinhVienPoly {
    private final double marketing;
    private final double sales;

    public SinhVienBiz(String hoTen, double marketing, double sales) {
        super(hoTen, "Biz");
        this.marketing = marketing;
        this.sales = sales;
    }

    @Override
    public double getDiem() {
        return (2 * marketing + sales) / 3;
    }
}

public class lab7_fpt_bai4 {
    static ArrayList<SinhVienPoly> list = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        while (true) {

            System.out.println("   HỆ THỐNG QUẢN LÝ SINH VIÊN");
            System.out.println(" ");
            System.out.println("1. Nhập danh sách sinh viên");
            System.out.println("2. Xuất danh sách sinh viên");
            System.out.println("3. Xuất sinh viên có học lực Giỏi");
            System.out.println("4. Sắp xếp danh sách theo điểm");
            System.out.println("0. Thoát");

            System.out.print(">> Chọn chức năng: ");

            try {
                int chon = Integer.parseInt(scanner.nextLine());
                switch (chon) {
                    case 1:
                        nhap();
                        break;
                    case 2:
                        xuat();
                        break;
                    case 3:
                        xuatGioi();
                        break;
                    case 4:
                        sapXep();
                        break;
                    case 0:
                        System.out.println("Đã thoát chương trình!");
                        System.exit(0);
                    default:
                        System.out.println("Vui lòng chọn từ 0-4.");
                }
            } catch (Exception e) {
                System.out.println("Lỗi: Vui lòng nhập số nguyên!");
            }
        }
    }

    public static void nhap() {
        System.out.println(" 1. NHẬP DANH SÁCH");
        while (true) {
            System.out.print("Nhập họ tên: ");
            String ten = scanner.nextLine();

            System.out.print("Loại sinh viên (1: IT, 2: Biz): ");
            int loai = Integer.parseInt(scanner.nextLine());

            if (loai == 1) {
                System.out.print("Điểm Java: ");
                double java = Double.parseDouble(scanner.nextLine());
                System.out.print("Điểm HTML: ");
                double html = Double.parseDouble(scanner.nextLine());
                System.out.print("Điểm CSS: ");
                double css = Double.parseDouble(scanner.nextLine());

                list.add(new SinhVienIT(ten, java, html, css));
            } else {
                System.out.print("Điểm Marketing: ");
                double mar = Double.parseDouble(scanner.nextLine());
                System.out.print("Điểm Sales: ");
                double sales = Double.parseDouble(scanner.nextLine());

                list.add(new SinhVienBiz(ten, mar, sales));
            }

            System.out.print("Nhập thêm nữa không? (Y/N): ");
            if (scanner.nextLine().equalsIgnoreCase("N")) {
                break;
            }
        }
    }

    public static void xuat() {
        System.out.println(" 2. DANH SÁCH SINH VIÊN");
        if (list.isEmpty()) {
            System.out.println("Danh sách trống!");
            return;
        }
        for (SinhVienPoly sv : list) {
            sv.xuat();
        }
    }

    public static void xuatGioi() {
        System.out.println(" 3. SINH VIÊN HỌC LỰC GIỎI ");
        boolean coSVGioi = false;
        for (SinhVienPoly sv : list) {
            if (sv.getHocLuc().equalsIgnoreCase("Giỏi")) {
                sv.xuat();
                coSVGioi = true;
            }
        }
        if (!coSVGioi) {
            System.out.println("Không có sinh viên nào học lực Giỏi.");
        }
    }

    public static void sapXep() {
        System.out.println(" 4. SẮP XẾP THEO ĐIỂM (GIẢM DẦN) ");

        Comparator<SinhVienPoly> comp = new Comparator<SinhVienPoly>() {
            @Override
            public int compare(SinhVienPoly o1, SinhVienPoly o2) {
                return Double.compare(o2.getDiem(), o1.getDiem());
            }
        };

        Collections.sort(list, comp);
        System.out.println("Đã sắp xếp xong!");
        xuat();
    }
}