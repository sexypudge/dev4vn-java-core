package lab6;

import java.util.Scanner;

public class lab6_fpt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Nhập họ và tên: ");
        String hoTen = scanner.nextLine();


        hoTen = hoTen.trim();


        int firstSpace = hoTen.indexOf(" ");
        int lastSpace = hoTen.lastIndexOf(" ");

        if (firstSpace == -1) {
            System.out.println("Chuỗi nhập vào không có khoảng trắng");
            return;
        }


        String ho = hoTen.substring(0, firstSpace).toUpperCase();


        String tenDem = hoTen.substring(firstSpace + 1, lastSpace);


        String ten = hoTen.substring(lastSpace + 1).toUpperCase();


        System.out.println("Họ: " + ho);
        System.out.println("Tên đệm: " + tenDem);
        System.out.println("Tên: " + ten);
    }
}
