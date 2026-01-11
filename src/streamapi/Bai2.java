package streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Comparator;

public class Bai2 {

    public void chay() {

        List<Nguoi> danhSachNguoi = Arrays.asList(
                new Nguoi("thế", 22),
                new Nguoi("bình", 17),
                new Nguoi("thành", 25)
        );

        List<Nguoi> sapXepTheoTuoi = danhSachNguoi.stream()
                .sorted(Comparator.comparing(Nguoi::getTuoi))
                .collect(Collectors.toList());

        for (Nguoi n : sapXepTheoTuoi) {
            System.out.println("Tên: " + n.getTen() + ", Tuổi: " + n.getTuoi());
        }
    }
}
// xếp tuoir tăng dần.