package lab6;

import java.util.ArrayList;
import java.util.Scanner;

public class lab6_fpt_bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<SinhVien> list = new ArrayList<>();


        String reEmail = "\\w+@\\w+(\\.\\w+){1,2}";


        String reSDT = "0\\d{9}";


        String reCMND = "\\d{9,12}";

        System.out.println("--- NHẬP DANH SÁCH 5 SINH VIÊN ---");


        for (int i = 0; i < 5; i++) {
            System.out.println("\nNhập thông tin sinh viên thứ " + (i + 1) + ":");


            System.out.print("Họ và tên: ");
            String hoTen = scanner.nextLine();


            String email;
            while (true) {
                System.out.print("Email: ");
                email = scanner.nextLine();
                if (email.matches(reEmail)) {
                    break;
                } else {
                    System.out.println("Lỗi: Email không hợp lệ (VD: abc@gmail.com). Nhập lại!");
                }
            }


            String sdt;
            while (true) {
                System.out.print("Số điện thoại (10 số, bắt đầu bằng 0): ");
                sdt = scanner.nextLine();
                if (sdt.matches(reSDT)) {
                    break;
                } else {
                    System.out.println("Lỗi: SĐT phải bắt đầu bằng 0 và có 10 chữ số. Nhập lại!");
                }
            }


            String cmnd;
            while (true) {
                System.out.print("CMND/CCCD (9-12 số): ");
                cmnd = scanner.nextLine();
                if (cmnd.matches(reCMND)) {
                    break;
                } else {
                    System.out.println("Lỗi: CMND phải là số và có từ 9-12 ký tự. Nhập lại!");
                }
            }


            list.add(new SinhVien(hoTen, email, sdt, cmnd));
        }


        System.out.println("\n--- DANH SÁCH SINH VIÊN ĐÃ NHẬP ---");
        for (SinhVien sv : list) {
            sv.xuat();

        }

    }
}

class SinhVien {
    private String hoTen;
    private String email;
    private String sdt;
    private String cmnd;

    public SinhVien() {
    }

    public SinhVien(String hoTen, String email, String sdt, String cmnd) {
        this.hoTen = hoTen;
        this.email = email;
        this.sdt = sdt;
        this.cmnd = cmnd;
    }

    public void xuat() {
        System.out.printf("Họ tên: %-20s | Email: %-20s | SĐT: %-12s | CMND: %-12s\n",
                this.hoTen, this.email, this.sdt, this.cmnd);
    }


}
