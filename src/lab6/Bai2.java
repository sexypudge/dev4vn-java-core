package lab6;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {

        ArrayList<SanPham> list = new ArrayList<>();
        System.out.println("nhập 5 sp: ");
        for (int i = 1; i <= 5; i++) {
            System.out.println("nhập sp thứ " + i);
            SanPham sp = new SanPham();
            sp.nhap();
            list.add(sp);
        }

        System.out.println("các sp nokia: ");
        for (SanPham sp : list) {
            if (sp.hang.equalsIgnoreCase("NOKIA")) {
                sp.xuat();
            }
        }
    }
}
