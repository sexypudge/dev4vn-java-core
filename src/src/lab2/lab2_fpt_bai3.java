import java.util.Scanner;

public class lab2_fpt_bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số điện đã sử dụng: ");
        int soDien = sc.nextInt();
        if (soDien<=50){
            System.out.println("Số tiền điện là: "+(soDien*1000)+" VND");
        }
        else{
            System.out.println(("Số tiền điện là: "+((50*1000)+(soDien-50)*1200)));
        }
    }
}
