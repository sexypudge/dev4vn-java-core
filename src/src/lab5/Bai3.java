package lab5;

import java.util.ArrayList;
import java.util.Scanner;

public class Bai3 {
    ArrayList<String> list = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Bai3 app = new Bai3();
    }

    public void menu(){
        int choice;
        do{
            System.out.println("\n===== MENU =====");
            System.out.println("1. Nhập danh sách họ tên");
            System.out.println("2. Xuất danh sách");
            System.out.println("3. Xuất danh sách :");
            System.out.println("4. Sắp xếp giảm dần:");
            System.out.println("5. Tìm và xóa họ tên");
            System.out.println("6. Kết thúc");
            System.out.print("Chọn chức năng: ");
            choice = scanner.nextInt();
            
        }
    }
}
