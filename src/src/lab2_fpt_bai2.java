import java.sql.SQLOutput;
import java.util.Scanner;

public class lab2_fpt_bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào giá trị a phương trình bậc 2 (ax^2+bx+c=0): ");
        double a = sc.nextDouble();
        System.out.println("Nhập vào giá trị b phương trình bậc 2 (ax^2+bx+c=0): ");
        double b = sc.nextDouble();
        System.out.println("Nhập vào giá trị c phương trình bậc 2 (ax^2+bx+c=0): ");
        double c = sc.nextDouble();
        double denta = Math.pow(b,2)-4*a*c;

        if (a==0){
            pt1(b,c);
        }
        else{
            if(denta<0){
                System.out.println("Phương trình vô nghiệm");
            }
            else if(denta==0){
                System.out.println("Phương trình có nghiệm kép lần lượt là: "+ ((-b)/2*a));

            }
            else{
                System.out.println("Phương trình có 2 nghiệm phân biệt lần lượt là: ");
                System.out.println("x1= "+(((-b)+Math.sqrt(denta))/(2*a)));
                System.out.println("x2= "+(((-b)-Math.sqrt(denta))/(2*a)));
            }

        }

    }

    public static void pt1(double z,double x) {


        if (z==0){
            if(x==0){
                System.out.println("Phương trình có vô số nghiệm");
            }
            else{
                System.out.println("Phương trình vô nghiệm");
            }

        }
        else{
            System.out.println("Phương trình có nghiệm là: "+(-x/z));
        }
    }
}
