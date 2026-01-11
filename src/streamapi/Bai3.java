package streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Bai3 {

    public void chay() {

        List<Nguoi> danhSachNguoi = Arrays.asList(
                new Nguoi("An", 22),
                new Nguoi("Bình", 17),
                new Nguoi("Chi", 25)
        );

        List<Nguoi> nguoiDu18 = danhSachNguoi.stream()
                .filter(n -> n.getTuoi() >= 18)
                .collect(Collectors.toList());

        for (Nguoi n : nguoiDu18) {
            System.out.println("Tên: " + n.getTen() + ", Tuổi: " + n.getTuoi());
        }
    }
}
// lo đủ 18 tuổi