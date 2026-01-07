package lab5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

    public class Bai2 {


        ArrayList<String> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        public static void main(String[] args) {

            Bai2 app = new Bai2();
            app.menu();
        }


        public void menu() {
            int choice;
            do {
                System.out.println("1. Nhập danh sách họ tên");
                System.out.println("2. Xuất danh sách");
                System.out.println("3. Xuất ngẫu nhiên:");
                System.out.println("4. Sắp xếp giảm dần:");
                System.out.println("5. xóa ");
                System.out.println("6. Kết thúc");
                System.out.print("Chọn chức năng: ");

                choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice) {
                    case 1:
                        nhap();
                        break;
                    case 2:
                        xuat();
                        break;
                    case 3:
                        xepngaunhien();
                        break;
                    case 4:
                        sapxep();
                        break;
                    case 5:
                        xoa();
                        break;
                    case 6:
                        System.out.println("Kết thúc chương trình.");
                        break;
                }
            } while (choice != 6);
        }

        public void nhap() {
            while (true) {
                System.out.print("Nhập họ tên: ");
                String name = scanner.nextLine();
                list.add(name);

                System.out.print("Nhập thêm tên (Y/N): ");
                String choice = scanner.nextLine();
                if (choice.equalsIgnoreCase("N")) {
                    break;
                }
            }
        }


        public void xuat() {

            System.out.println("\nDanh sách họ tên:");
            for (String name : list) {
                System.out.println(name);
            }
        }


        public void xepngaunhien() {

            Collections.shuffle(list);
            System.out.println("\nDanh sách sau  trộn:");
            xuat();
        }


        public void sapxep() {

            Collections.sort(list);
            Collections.reverse(list);
            System.out.println("\nDanh sách  giảm dần:");
            xuat();
        }


        public void xoa() {

            System.out.print("Nhập  tên muốn xóa ");
            String name = scanner.nextLine();

            boolean found = false;
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).equalsIgnoreCase(name)) {
                    list.remove(i);
                    found = true;
                    break;
                }
            }

            if (found) {
                System.out.println("Đã xóa !");
            } else {
                System.out.println("Không tìm thấy tên cần xóa.");
            }
        }
    }


