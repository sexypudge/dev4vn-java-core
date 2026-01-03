import java.util.Scanner;

public class bai12_baitap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào đây điểm trung bình: ");
        float diem = sc.nextFloat();
        String kq1 = (diem>=8)?"Giỏi":((diem<8&&diem>=6.5)?"Khá":((diem<6.5&&diem>=5)?"Trung bình":"Yếu"));
        System.out.println(kq1);

    }
}
