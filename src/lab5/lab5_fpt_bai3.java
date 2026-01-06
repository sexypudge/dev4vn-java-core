package lab5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class lab5_fpt_bai3 {

    static ArrayList<SanPham> ls = new ArrayList<>();
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        int chon;
        do {
            System.out.println("  QUAN LY SAN PHAM  ");
            System.out.println("1. Nhap danh sach");
            System.out.println("2. Sap xep giam dan theo gia");
            System.out.println("3. Xoa san pham theo ten");
            System.out.println("4. Tinh gia trung binh");
            System.out.println("0. Thoat");
            System.out.print("Moi chon: ");

            chon = s.nextInt();
            s.nextLine();

            switch (chon) {
                case 1: nhap(); break;
                case 2: sapxep(); break;
                case 3: xoa(); break;
                case 4: tinhTrungBinh(); break;
                case 0: System.out.println("Bye bye!"); break;
                default: System.out.println("Nhap sai roi, chon lai di!");
            }
        } while (chon != 0);
    }

    public static void nhap() {
        System.out.println("Nhap thong tin san pham:");
        while (true) {
            System.out.print("Ten SP: ");
            String ten = s.nextLine();

            System.out.print("Gia: ");
            Double gia = s.nextDouble();
            s.nextLine();

            ls.add(new SanPham(ten, gia));

            System.out.print("Nhap tiep khong (Y/N)? ");
            if (s.nextLine().equalsIgnoreCase("N")) {
                break;
            }
        }
    }

    public static void sapxep() {
        Comparator<SanPham> comp = new Comparator<SanPham>() {
            @Override
            public int compare(SanPham o1, SanPham o2) {
                return o2.donGia.compareTo(o1.donGia);
            }
        };

        Collections.sort(ls, comp);
        System.out.println(" Danh sach sau khi sap xep ");
        xuat();
    }

    public static void xuat() {
        for (SanPham sp : ls) {
            System.out.printf("Ten: %s | Gia: %.2f \n", sp.ten, sp.donGia);
        }
    }

    public static void xoa() {
        System.out.print("Nhap ten muon xoa: ");
        String ten = s.nextLine();
        boolean check = false;

        for (int i = 0; i < ls.size(); i++) {
            if (ls.get(i).ten.equalsIgnoreCase(ten)) {
                ls.remove(i);
                System.out.println("Da xoa san pham: " + ten);
                check = true;
                break;
            }
        }

        if (!check) {
            System.out.println("Khong tim thay ten nay!");
        }
    }

    public static void tinhTrungBinh() {
        if (ls.isEmpty()) {
            System.out.println("Danh sach trong!");
            return;
        }

        double tong = 0;
        for (SanPham sp : ls) {
            tong += sp.donGia;
        }

        double tb = tong / ls.size();
        System.out.println("Gia trung binh: " + tb);
    }
}

class SanPham {
    public String ten;
    public Double donGia;

    public SanPham(String ten, Double donGia) {
        this.ten = ten;
        this.donGia = donGia;
    }
}