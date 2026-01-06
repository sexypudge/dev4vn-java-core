package lab5;

import java.util.ArrayList;
import java.util.Scanner;

public class lab5_fpt {
    public static void main(String[] args) {
        ArrayList<Double> soThuc = new ArrayList<Double>();
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Hãy nhập vào đây số thực: ");
            Double x = sc.nextDouble();
            soThuc.add(x);
            System.out.println("Bạn có muốn nhập thêm không?(Y/N) ");
            sc.nextLine();
            String traLoi = sc.nextLine();
            if (traLoi.equalsIgnoreCase("n")){
                break;
            }
        }
        double tong=0;
        for (double i : soThuc){
            tong = tong+i;

        }
        System.out.println(tong);

    }
}
