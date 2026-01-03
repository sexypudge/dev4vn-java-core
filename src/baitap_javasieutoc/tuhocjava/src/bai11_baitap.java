import java.util.Scanner;

public class bai11_baitap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double Tong;
        double Hieu;
        System.out.println("Hãy nhập giá trị tổng: ");
        Tong=sc.nextDouble();
        System.out.println("Hãy nhập giá trị hiệu: ");
        Hieu=sc.nextDouble();

        System.out.println("Phương trình sẽ là x+y= "+Tong+", x-y= "+Hieu);
        double x;
        double y;
        System.out.println("Kết quả x: "+ ((Tong+Hieu)/2));
        System.out.println("Kết quả y: "+(Tong-((Tong+Hieu)/2)));
    }
}
