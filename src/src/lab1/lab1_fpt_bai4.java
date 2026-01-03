import java.util.Scanner;

public class lab1_fpt_bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập giá trị a của pt: ");
        double a = sc.nextDouble();
        System.out.println("Nhập giá trị b của pt: ");

        double b = sc.nextDouble();
        System.out.println("Nhập giá trị c của pt: ");
        double c = sc.nextDouble();
        double denta = Math.pow(b,2)-4*a*c;
        System.out.println("Giá trị denta là: "+denta);
    }
}
