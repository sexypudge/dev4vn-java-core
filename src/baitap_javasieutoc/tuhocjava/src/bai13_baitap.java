import java.util.Scanner;

public class bai13_baitap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hãy nhập số vào để thực hiện các phương thức sau:");
        System.out.println("1. tìm theo tên");
        System.out.println("2. tìm theo tác giả");
        System.out.println("3. tìm theo nhà xuất bản");
        System.out.println("4. tìm theo tiêu đề");
        int a = sc.nextInt();
        switch (a){
            case 1:
                System.out.println("tìm theo tên");
                break;
            case 2:
                System.out.println("tìm theo tác giả");
                break;

            case 3:
                System.out.println("tìm theo nhà xuất bản");
                break;

            case 4:
                System.out.println("tìm theo tiêu đề");
                break;

            default:
                System.out.println("Cú pháp lỗi");
                break;
        }



    }
}
