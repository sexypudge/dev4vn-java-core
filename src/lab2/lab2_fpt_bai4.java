import java.util.Scanner;

public class lab2_fpt_bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int trloi;
        while (true){
            System.out.println("Hãy bấm số để lựa chọn:");
            System.out.println("1.Giải pt bậc 1 ");
            System.out.println("2.Giải pt bậc 2");
            System.out.println("3.Tính tiền điện");
            System.out.println("4.Kết Thúc");
            trloi=sc.nextInt();
            if(trloi==1){
                System.out.println("Hãy nhập vào giá trị a của pt bậc 1 (ax+b=0)");
                double g = sc.nextDouble();
                System.out.println("Hãy nhập vào giá trị b của pt bậc 1 (ax+b=0)");
                double h = sc.nextDouble();
                pt1(g,h);

            }
            else if(trloi==2){
                System.out.println("Hãy nhập vào giá trị a của pt bậc 2 (ax^2+bx+c=0)");
                double n1 = sc.nextDouble();
                System.out.println("Hãy nhập vào giá trị b của pt bậc 2 (ax^2+bx+c=0)");
                double n2 = sc.nextDouble();
                System.out.println("Hãy nhập vào giá trị c của pt bậc 2 (ax^2+bx+c=0)");
                double n3 = sc.nextDouble();
                pt2(n1,n2,n3);


            }
            else if(trloi==3){
                System.out.println("Hãy nhập số điện: ");
                int soDien1= sc.nextInt();
                tienDien(soDien1);

            }
            else{
                System.out.println("Cảm ơn đã sử dụng ctrinh !!");
                System.out.println("Tạm biệt!!");
                break;
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

    public static void tienDien(int soDien) {

        if (soDien<=50){
            System.out.println("Số tiền điện là: "+(soDien*1000)+" VND");
        }
        else{
            System.out.println(("Số tiền điện là: "+((50*1000)+(soDien-50)*1200)));
        }
    }
    public static void pt2 (double a, double b, double c) {

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


}
