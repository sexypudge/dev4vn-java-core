import java.util.ArrayList;
import java.util.Scanner;

public class lab5_fpt2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        ArrayList <String> hoVaTen = new ArrayList<String>();
        if (hoVaTen.get(0)==null){
            System.out.println("Danh sách chưa có giá trị nào");
            System.out.println("Hãy nhập vào đây giá trị họ và tên:");
            hoVaTen.add(sc.nextLine());
            System.out.println(hoVaTen.get(0));

        }
    }
}
