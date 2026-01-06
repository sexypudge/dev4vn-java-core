import java.util.Scanner;

public class lab1_fpt_bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào đây giá trị của cạnh a: ");
        int a = sc.nextInt();
        System.out.println("Nhập vào đây giá trị của cạnh b: ");
        int b = sc.nextInt();
        int cv = 2*(a+b);
        int dt = a*b;
        System.out.println("Chu vi của hình chữ nhật cạnh "+a+" và "+b+" là:"+cv);
        System.out.println();
        System.out.println("Diện tích của hình chữ nhật cạnh "+a+" và "+b+" là:"+dt);
        System.out.println();
        System.out.println("Cạnh nhỏ nhất của hình chữ nhật cạnh "+a+" và "+b+" là:"+Math.min(a,b));
    }
}
