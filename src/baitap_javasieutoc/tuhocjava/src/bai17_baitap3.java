import java.util.Scanner;

public class bai17_baitap3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 11;
        while (a>10&&a<50){
            if (a%3==0){
                System.out.println(a);
                a++;
            }else{
                a++;
            }


        }
    }
}
