package lab5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class lab5_fpt_bai2 {

    static ArrayList<String> list = new ArrayList<>();
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        int chon;
        do {
            System.out.println("\nMENU QUAN LY HO TEN");
            System.out.println("1. Nhap danh sach");
            System.out.println("2. Hien thi danh sach");
            System.out.println("3. Sap xep ngau nhien");
            System.out.println("4. Sap xep giam dan");
            System.out.println("5. Xoa ho ten");
            System.out.println("6. Ket thuc");
            System.out.print("Moi chon: ");

            chon = s.nextInt();
            s.nextLine();

            switch (chon) {
                case 1: nhap(); break;
                case 2: xuat(); break;
                case 3: ngaunhien(); break;
                case 4: sapxep(); break;
                case 5: xoa(); break;
                case 6: System.out.println("Bye bye!"); break;
                default: System.out.println("Nhap sai roi, nhap lai di!");
            }
        } while (chon != 6);
    }

    public static void nhap() {
        while (true) {
            System.out.print("Nhap ho ten: ");
            String x = s.nextLine();
            list.add(x);

            System.out.print("Nhap tiep khong (Y/N)? ");
            if (s.nextLine().equalsIgnoreCase("N")) {
                break;
            }
        }
    }

    public static void xuat() {
        if (list.isEmpty()) {
            System.out.println("Danh sach trong!");
            return;
        }
        System.out.println("Danh sach hien tai:");
        for (String item : list) {
            System.out.println(item);
        }
    }

    public static void ngaunhien() {
        Collections.shuffle(list);
        xuat();
    }

    public static void sapxep() {
        Collections.sort(list);
        Collections.reverse(list);
        xuat();
    }

    public static void xoa() {
        System.out.print("Nhap ten muon xoa: ");
        String ten = s.nextLine();
        boolean check = false;

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(ten)) {
                list.remove(i);
                check = true;
                System.out.println("Da xoa thanh cong!");
                break;
            }
        }

        if (!check) {
            System.out.println("Khong tim thay ten nay!");
        }
    }
}