import java.util.Scanner;

public class bai10_scanner {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Bài toán tính chu vi, diện tích của hình tròn");
        System.out.println("Hãy vui lòng nhập bán kính hình tròn: ");
        float r = sc.nextFloat();
        double p = r*2*Math.PI;
        double s = Math.PI*Math.pow(r,2);
        System.out.println("Diện tích là bằng: "+s);
        System.out.println("Chu vi là bằng: "+p);

    }
}
