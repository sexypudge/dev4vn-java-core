import java.util.Scanner;

public class bai17_bai5 {
    public static void main(String[] args) {





        Scanner sc = new Scanner(System.in);



        while(true){
            System.out.println("Nhập vào đây số nguyên a: ");
            int a = sc.nextInt();
            if (a<=0){
                System.out.println("Số a phải lớn hơn 0, vui lòng nhập lại");
                a=sc.nextInt();
            }
            int counter = 0;
            for (int i = 1;i<=a;i++){

                if(a%i==0){
                    counter++;
                }
            }
            if (counter==2){
                System.out.println(a+" là số nto");
            }else{
                System.out.println(a+" ko phải số nto");
            }


            System.out.println("bạn có muốn tiếp tục sdung chương trình không?");

            sc.nextLine();

            String traloi = sc.nextLine();

            if (traloi.equals("y")){
                System.out.println("Cảm ơn đã sử dụng");
                break;
            }
        }
    }
}
