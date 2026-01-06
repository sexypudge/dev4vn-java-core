package tuhocjava;

import java.util.Scanner;

public class bai11_ifelse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập vào số điểm của bạn: ");
        float diem = sc.nextFloat();
        System.out.println("điểm của bạn là : " + diem);
        if (diem >= 5.0) {
            System.out.println("Kết quả đã: Đỗ");
        } else {
            System.out.println("Kết quả đã: Trượt");
        }
    }
}
