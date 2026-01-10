package java1.lab6.act1;

import java.util.Scanner;

public class act1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap vao ten: ");
        String name = sc.nextLine().trim();

        int firstSpace = name.indexOf(" ");
        int lastSpace = name.lastIndexOf(" ");

        String ho = name.substring(0, firstSpace).toUpperCase();
        String tenDem = name.substring(firstSpace + 1, lastSpace);
        String ten = name.substring(lastSpace + 1).toUpperCase();

        System.out.println("ho: " + ho);
        System.out.println("ten dem: " + tenDem);
        System.out.println("ten: " + ten);

    }
}
