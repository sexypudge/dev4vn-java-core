import java.util.Scanner;

public class bai17_baitap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số nguyên a: ");
        int a = sc.nextInt();
        int i =0;
        int kq=0;
        while (i<=a){
            if(a%2==0){
                System.out.println("số của mày là "+a );

                kq+=i;
                i=i+2;
                System.out.println(kq);

            }else{
                System.out.println("số lẻ rồi nigga! nhập lại đi");
                a=sc.nextInt();
            }




        }
    }
}
