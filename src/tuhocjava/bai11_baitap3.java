import java.util.Scanner;

public class bai11_baitap3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hãy nhập tháng muốn kiểm tra: ");
        int nam1 = sc.nextInt();
        if(nam1==1||nam1==3||nam1==5||nam1==7||nam1==8||nam1==10||nam1==12){
            System.out.println("tháng "+nam1+" có 31 ngày");
        }
        if(nam1==4||nam1==6||nam1==9||nam1==11){
            System.out.println("tháng "+nam1+" có 30 ngày");
        }

        if (nam1==2){
            System.out.println("Hãy nhập thêm năm: ");
            int nam = sc.nextInt();
            if (((nam%4==0) && (nam%100!=0)) || (nam%400==0)){
                System.out.println("Tháng 2 năm "+nam+" có 29 ngày !!!");


            }else{
                System.out.println("Tháng 2 năm "+nam+" chỉ có 28 ngày");
            }

        }


    }
}
