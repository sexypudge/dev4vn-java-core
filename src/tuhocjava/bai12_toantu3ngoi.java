import java.util.Scanner;

public class bai12_toantu3ngoi {
    public static void main(String[] args) {
        System.out.println("Nhập vào một số để kiểm tra");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String kq = (a % 2 == 0) ? "Chẵn" : "Lẻ";
        System.out.println(kq);


    }

}
