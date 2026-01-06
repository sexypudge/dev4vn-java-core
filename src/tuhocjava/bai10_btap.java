import java.util.Scanner;

public class bai10_btap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập độ dài chiều dài a: ");
        double a = sc.nextDouble();
        System.out.println("Nhập độ dài chiều rộng b: ");
        double b = sc.nextDouble();
        double cv = (a+b)*2;
        double dt = a*b;
        System.out.println("Chu vi: "+cv);
        System.out.println("Diện tích : "+dt);

    }
}
