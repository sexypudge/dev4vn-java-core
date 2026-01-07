package lab6;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("nhập họ   tên: ");
        String hoTen = sc.nextLine().trim();

        int dau = hoTen.indexOf(" ");
        int cuoi = hoTen.lastIndexOf(" ");

        String ho = hoTen.substring(0, dau).toUpperCase();
        String ten = hoTen.substring(cuoi + 1).toUpperCase();
        String tenDem = hoTen.substring(dau + 1, cuoi);

        System.out.println("họ: " + ho);
        System.out.println("tên đệm: " + tenDem);
        System.out.println("tên: " + ten);
    }
}
