import java.util.Scanner;

public class bai18_forlongnhau {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hãy nhập vào số lẻ để vẽ kim tự tháp: ");
        int n = sc.nextInt();
        while (n%2==0){
            System.out.println("Hãy nhập lại 1 số lẻ để tiếp tục");
            n=sc.nextInt();

        }
        System.out.println("Đáy của kim tự tháp có giá trị là: "+n);
        int cao =0;
        for(int z=n;z>=1;z=z-2){
            cao++;
        }


        for (int i =1;i<=cao;i++){
            for(int j =1;j<=cao-i;j++){
                System.out.print("  ");
            }
            for (int k =1;k<=2*i-1;k++){
                System.out.print("* ");
            }
            System.out.println("");

        }


    }
}


