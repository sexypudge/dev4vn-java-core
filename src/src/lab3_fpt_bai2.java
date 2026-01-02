public class lab3_fpt_bai2 {
    public static void main(String[] args) {
        System.out.println("Bảng cửu chương:");
        for (int i =1;i<=10;i++){
            for (int j =1;j<=10;j++){
                System.out.print(i+" * "+j+" = "+(i*j));
                if(i==10){
                    System.out.print("    ");

                }
                else if(i*j>=10){
                    System.out.print("     ");

                } else if (i*j<10) {
                    System.out.print("      ");
                }

            }
            System.out.println();
        }
    }
}
