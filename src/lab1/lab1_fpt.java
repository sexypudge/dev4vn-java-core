import java.util.Scanner;

public class lab1_fpt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào họ và tên: ");
        String hoVaTen = sc.nextLine();
        System.out.println("Nhập vào số điểm trung bình: ");
        float diem = sc.nextFloat();

        System.out.print(hoVaTen+" "+diem+" điểm");
    }
}
