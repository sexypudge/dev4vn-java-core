public class bai17_bai3 {
    public static void main(String[] args) {
        int i =1;
        int f=0;

        int kq=1;
        for (int z=1;z<=10;z++){

            while (i<=z){
                kq=i*kq;
                i++;

            }

            f=f+kq;
            System.out.println(f);
        }


        }






    }









