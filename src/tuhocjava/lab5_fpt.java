import java.util.ArrayList;
import java.util.Scanner;

public class lab5_fpt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Double> x = new ArrayList<Double>();
        int count = 0;
        double tong =0;
        String trloi;
        while (true){
            System.out.println("Nhap vao gia tri de them vao mang X:");
            x.add(sc.nextDouble());
            count++;
            System.out.println("ban co muon nhap tiep khong ?");
            sc.nextLine();
            trloi=sc.nextLine();

            if(trloi.equals("n")){
                for(int i=0;i<=count-1;i++){
                    tong = tong+ x.get(i);

                }
                break;
            }
        }
        System.out.println("tong cua cac gia tri trong mang la: "+tong);
    }
}
