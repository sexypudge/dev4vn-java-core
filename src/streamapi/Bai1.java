package streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Bai1 {

    public void loc() {

        List<Integer> danhSachSo = Arrays.asList(1, 2, 3, 4, 5, 6);

        List<Integer> soChan = danhSachSo.stream()
                .filter(so -> so % 2 == 0)
                .collect(Collectors.toList());

        for (Integer so : soChan) {
            System.out.println(so);
        }
    }
}
// lọc số chẵn trong ds

