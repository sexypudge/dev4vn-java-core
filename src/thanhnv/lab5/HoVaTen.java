package thanhnv.lab5;

        import java.util.Comparator;
        import java.util.Scanner;
        import java.util.ArrayList;

public class HoVaTen {

    static ArrayList<SanPham> list = new ArrayList<SanPham>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int chon;
        do {
            menu();
            System.out.println("chon option: ");
            chon = sc.nextInt();
            sc.nextLine();

            switch (chon){
                case 1-> nhap();
                case 2->sapXep();
                case 3->timVaXoa();
                case 4->giaTrungBinh();
                case 5-> System.out.println("ket thuc!");
                default -> System.out.println("chon sai!");
            }

        }while (chon!=5);
    }
    static void nhap(){
        while (true){
            System.out.println("nhap vao san pham: ");
            String tenSp = sc.nextLine();
            System.out.println("nhap gia san pham");
            double giaSp = sc.nextDouble();
            list.add(new SanPham(tenSp, giaSp));

            System.out.println("tiep tuc nhap them san pham? Y or N?");
            if (sc.nextLine().equalsIgnoreCase("Y")){
                break;
            }
        }
    }

    static void sapXep(){
        Comparator<SanPham>comp = new Comparator<SanPham>(){

            @Override
            public int compare(SanPham s1, SanPham s2){
                return Double.compare(s2.giaSp, s1.giaSp);
            }
        };
    }

    static void timVaXoa(){
        System.out.println("nhap ten sp can xoa");
        String tenXoa = sc.nextLine();
        boolean found = false;

        for (SanPham sp : list ){
            if(sc.nextLine().equalsIgnoreCase(tenXoa)){
                list.remove(tenXoa);
                break;
            }
        }

        if(found){
            System.out.println("da xoa san pham");
        }else{
            System.out.println("khong tim thay san pham");
        }

    }

    static void giaTrungBinh(){
        if(list.isEmpty()){
            System.out.println("rong~");
            return;
        }
        double tong = 0;
        for (SanPham sp : list){
            tong+=sp.giaSp;
        }
        System.out.println("gia trung binh san pham la: "+(tong/list.size()));
    }
    static void menu(){
        System.out.println("menu:");
        System.out.println("nhap vao san pham");
        System.out.println("sap xep giam dan");
        System.out.println("tim va xoa san pham");
        System.out.println("gia trung binh");
        System.out.println("thoat");
    }

}
