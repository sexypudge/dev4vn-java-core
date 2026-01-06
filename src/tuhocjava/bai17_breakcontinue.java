public class bai17_breakcontinue {
    public static void main(String[] args) {
        int tong = 0;
        for (int i =0;i<=10;i++){
            if (i==3){
                continue;}
            else {
                tong+=i;
                System.out.println(tong);
                System.out.println(i);

            }
        }
    }
}
