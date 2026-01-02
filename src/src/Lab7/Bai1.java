package Lab7;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        ChuNhat cn1 = new ChuNhat(5,3);
        Vuong v1= new Vuong(6);

        Scanner sc = new Scanner(System.in);
        System.out.println(" Hình chữ nhật: ");
        cn1.xuat();

        System.out.println("Hình Vuông: ");
        v1.xuat();
    }
}
