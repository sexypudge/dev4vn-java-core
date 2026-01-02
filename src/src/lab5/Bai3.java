package lab5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Bai3 {
    ArrayList<SanPham> list = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Bai3 app = new Bai3();
        app.menu();
    }

    public void menu(){
        int choice;
        do{
            System.out.println("1. Nhập danh sách sp");
            System.out.println("2. sắp xếp giá sp: ");
            System.out.println("3. xóa sp  :");
            System.out.println("4. giá trung bình:");
            System.out.println("5. Kết thúc");
            System.out.print("Chọn chức năng: ");
            choice = sc.nextInt();


            sc.nextLine();

            switch (choice) {
                case 1:
                    nhap();
                    break;
                case 2:
                    sapXep();
                    break;
                case 3:
                    xoa();
                    break;
                case 4:
                    giaTb();
                    break;
                case 5:
                    System.out.println("Kết thúc chương trình.");
                    break;
            }
        } while (choice != 5);
    }

    public void nhap() {
        while (true) {
            System.out.print("Nhập tên sp: ");
            String ten = sc.nextLine();

            System.out.print("Nhập giá: ");
            double gia = sc.nextDouble();
            sc.nextLine();


            list.add(new SanPham(ten, gia));

            System.out.print("Nhập thêm sp (y/n): ");
            if (sc.nextLine().equalsIgnoreCase("n")) {
                break;
            }
        }
    }



    public void sapXep() {
        Comparator<SanPham> comp = new Comparator<SanPham>() {
            @Override
            public int compare(SanPham o1, SanPham o2) {
                return o2.gia.compareTo(o1.gia); // giảm dần
            }
        };

        Collections.sort(list, comp);
        for (SanPham sp : list) {
            sp.xuat();
        }
    }


    public void giaTb() {

        double tong = 0;
        for (SanPham sp : list) {
            tong += sp.gia;
        }

        System.out.println("Giá trung bình của sp: " + (tong / list.size()));
    }
    public void xoa() {

        System.out.print("Nhập  sp xóa ");
        String name = sc.nextLine();

        boolean found = false;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).ten.equalsIgnoreCase(name)) {
                list.remove(i);
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Đã xóa sp ");
        } else {
            System.out.println("Không tìm thấy sp cần xóa");
        }
    }
}





