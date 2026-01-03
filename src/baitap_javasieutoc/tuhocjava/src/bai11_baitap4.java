import java.util.Scanner;

public class bai11_baitap4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Phương trình bậc 2 sẽ là: ax^2+bx+c=0");
        double a,b,c;
        System.out.println("Hãy nhập vào giá trị của a:");
        a = sc.nextDouble();


        System.out.println("Hãy nhập vào giá trị của b:");
        b= sc.nextDouble();
        System.out.println("Hãy nhập vào giá trị của c:");
        c = sc.nextDouble();

        double denta = Math.pow(b,2)-4*a*c;

        if (denta < 0) {
            System.out.println("Phương trình vô nghiệm!!");
        }
        if( denta == 0){
            System.out.println("Phương trình có nghiệm kép là x1 = x2 = "+((-b)/2*a));
        }
        if(denta >0){
            System.out.println("Phương trình có 2 nghiệm phân biệt lần lượt là x1 = "+((-b+Math.sqrt(denta))/2*a)+" x2 = "+((-b-Math.sqrt(denta))/2*a));
        }


    }
}
