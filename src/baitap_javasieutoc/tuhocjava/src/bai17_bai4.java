public class bai17_bai4 {
    public static void main(String[] args) {

        int kq;
        for (int s =1;s<=1000;s++){
            kq=0;
            for (int i =1;i<s;i++){
                if (s%i==0){
                    kq=kq+i;
                }

            }
            if (kq==s){
                System.out.println(kq);
            }

        }


    }
}
