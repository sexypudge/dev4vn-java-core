import java.util.Scanner;

public class lab3_fpt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hãy nhập một số nguyên từ bàn phím: ");
        int a = sc.nextInt();
        int counter =0;
        for (int i =1;i<=a;i++){

            if(a%i==0){
                counter++;
            }

        }
        if(counter==2){
            System.out.println("Số "+a+" là số nguyên tố");
        }else{
            System.out.println("Số "+a+" không là số nguyên tố");
        }
    }
}
