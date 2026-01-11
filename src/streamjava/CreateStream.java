package streamjava;

import java.util.stream.Stream;

public class CreateStream {
    public static void main(String[] args) {
        Employee em1 = new Employee("thanhvn","1");
        Employee em2 = new Employee("quangthe","2");
        Employee em3 = new Employee("hongdang","3");
        Employee em4 = new Employee("khoga","6");
        Stream<Employee> stream = Stream.of(em1,em2,em3,em4);

        stream.forEach(item -> {
            System.out.println("name"+item.getName());
            System.out.println("id"+item.getId());
        });

    }
}
