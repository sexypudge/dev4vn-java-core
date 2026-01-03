import java.util.Scanner;

public class bai11_baitap5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tháng cần kiểm tra quý: ");
        int thang = sc.nextInt();
        if(thang==1||thang==2||thang==3){
            System.out.println("Tháng "+thang+" thuộc quý 1");

        }
        if(thang==4||thang==5||thang==6){
            System.out.println("Tháng "+thang+" thuộc quý 2");
        }
        if(thang==7||thang==8||thang==9){
            System.out.println("Tháng "+thang+" thuộc quý 3");
        }
        if(thang==10||thang==11||thang==12){
            System.out.println("Tháng "+thang+" thuộc quý 4");
        }
    }
}
