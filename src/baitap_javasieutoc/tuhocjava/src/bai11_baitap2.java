import java.util.Scanner;

public class bai11_baitap2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hãy nhập vào chiều cao: ");
        double cao= sc.nextDouble();
        System.out.println("Hãy nhập vào cân nặng: ");
        double nang= sc.nextDouble();
        double BMI = nang/(Math.pow(cao,2));
        System.out.println("Chỉ số BMI của bạn = "+BMI);
        if (BMI<15){
            System.out.println("Thân hình quá gầy");
        }
        if(BMI>=15&&BMI<16){
            System.out.println("Thân hình gầy");
        }
        if(BMI>=16&&BMI<=18.5){
            System.out.println("Thân hình hơi gầy");
        }
        if(BMI>=18.5&&BMI<25){
            System.out.println("Thân hình bình thường");
        }
        if(BMI>=25&&BMI<30){
            System.out.println("Thân hình hơi béo");
        }
        if(BMI>=30&&BMI<35){
            System.out.println("Thân hình béo");
        }
        if(BMI>=35){
            System.out.println("Thân hình quá béo");
        }

    }
}
