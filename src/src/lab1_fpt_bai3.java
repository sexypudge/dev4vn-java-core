import java.util.Scanner;

public class lab1_fpt_bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Hãy nhập giá trị cạnh a khối lập phương: ");
        double a = sc.nextDouble();
        double thetich = Math.pow(a,3);
        System.out.println("Thể tích của khối lp a là: "+thetich);




    }
}
