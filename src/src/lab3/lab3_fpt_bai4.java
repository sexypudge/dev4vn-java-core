import java.util.Scanner;

public class lab3_fpt_bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hãy nhập số lượng học sinh: ");
        int n = sc.nextInt();
        String[] hoTen = new String[n];
        double [] diem = new double[n];
        for (int i =0; i<n;i++){
            System.out.println("Hãy điền tên của học sinh thứ "+(i+1));
            sc.nextLine();
            hoTen[i]=sc.nextLine();
            System.out.println("Số điểm: ");
            diem[i]=sc.nextDouble();
        }
        double tamdiem;
        String tamten;

        for (int i =0;i<n;i++){
            for (int j =i+1;j<n;j++){
                if (diem[i]>diem[j]){
                    tamdiem=diem[i];
                    diem[i]=diem[j];
                    diem[j]=tamdiem;

                    tamten=hoTen[i];
                    hoTen[i]=hoTen[j];
                    hoTen[j]=tamten;
                }
            }
        }


        for (int i =0;i<n;i++){
            xepLoai(diem[i]);
            String kqxeploai=xepLoai(diem[i]);
            System.out.println(hoTen[i]+" , "+diem[i]+" "+kqxeploai);

        }
    }

    public static String xepLoai(double a){
        if(a<5){
            return "Yếu";
        } else if (a>=5&&a<6.5) {
            return"Trung bình";
            
        } else if (a>=6.5&&a<7.5) {
            return "Khá";
            
        } else if (a>=7.5&&a<9) {
            return"Giỏi";
            
        }else{
            return"Xuất sắc!!";
        }
    }
}
