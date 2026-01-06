import java.util.Scanner;

public class lab2_fpt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập giá trị a của pt bậc 1 (ax+b=0):");
        double a = sc.nextDouble();
        System.out.println("Nhập giá trị b của pt bậc 1 (ax+b=0):");
        double b = sc.nextDouble();
        if (a==0){
            if(b==0){
                System.out.println("Phương trình có vô số nghiệm");
            }
            else{
                System.out.println("Phương trình vô nghiệm");
            }

        }
        else{
            System.out.println("Phương trình có nghiệm là: "+(-b/a));
        }
    }
}
