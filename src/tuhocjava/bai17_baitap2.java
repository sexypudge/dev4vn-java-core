import java.util.Scanner;

public class bai17_baitap2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("NHập vào 1 số lẻ n: ");
        int n = sc.nextInt();
        int i = 1;
        int kq = 0;
        while (i<=n){
            if (n%2==0){
                System.out.println("Số chẵn rồi nigga, nhập lại đi: ");
                n = sc.nextInt();
            }
            else
            {
                if(i==3){
                    i=i+2;
                    break;}

                else{
                    kq+=i;


                    i=i+2;
                    System.out.println(kq);
                }


            }


        }
    }
}
