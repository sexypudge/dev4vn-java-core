import java.util.Scanner;

public class bai14_baitap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào đây số trong khoảng 1-99");
        int x = sc.nextInt();
        while (x<1||x>99){
            System.out.println("Số nhập không nằm trong khoảng từ 1-99, Yêu cầu nhập lại");
            x = sc.nextInt();
        }
    }
}
