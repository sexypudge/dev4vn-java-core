import java.util.Scanner;

public class bai13_switchcase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào 1 số nguyên:");
        int a = sc.nextInt();
        int div = a%2;
        switch (div){
            case 0:
                System.out.println(a+" là số chẵn");
                break;
            default:
                System.out.println(a+" là số lẻ");
                break;
        }
    }
}
