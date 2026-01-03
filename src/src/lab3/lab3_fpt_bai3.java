import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class lab3_fpt_bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hãy nhập số lượng phần tử có trong mảng: ");
        int soLuong= sc.nextInt();
        int[] mang = new int[soLuong];
        System.out.println("Hãy nhập vào các giá trị trong mảng: ");
        for(int i =0;i<soLuong;i++){
            mang[i]=sc.nextInt();
        }

        Arrays.sort(mang);
        System.out.println("Mảng của bạn có các giá trị là "+Arrays.toString(mang));
        System.out.println("Giá trị nhỏ nhất trong mảng là: "+mang[0]);
        int tbc = 0;
        int counter=0;
        System.out.println("Các phần tử chia hết cho 3 gồm: ");
        for(int j =0;j<soLuong;j++){

            if(mang[j]%3==0){

                System.out.println(mang[j]);
                tbc=tbc+mang[j];
                counter++;

            }

        }
        if(tbc==0){
            System.out.println("Không có giá trị nào chia hết cho 3");
        }
        System.out.println("Kết quả tbc: "+(tbc/counter));
    }
}
