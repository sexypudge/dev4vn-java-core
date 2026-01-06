import java.util.Calendar;

public class bai22_datetime {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        int nam = cal.get(Calendar.YEAR);
        int thang = cal.get(Calendar.MONTH);
        int ngay = cal.get(Calendar.DAY_OF_MONTH);
        System.out.println("Năm nay là năm: " + nam);
        System.out.println("tháng hiện tại là: " + (thang + 1));
        System.out.println("ngày hôm nay là ngày: " + ngay);
    }
}
