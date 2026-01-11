package streamjava;

import java.util.Arrays;
import java.util.List;
import java.util.stream.*;

public class JavaStream {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        numbers.stream().filter(n -> n % 2 == 0).map(n -> n * 2).forEach(System.out::println);

        List<Integer> num = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Integer sum = num.stream().filter(n -> n > 5).reduce(0, Integer::sum);
        System.out.println(sum);

        List<String> animals = Arrays.asList("cho","meo","lon","cavoi", " tete","camap","ngua");
        List<String> longWords = animals.stream().filter(animal -> animal.length()>3).collect(Collectors.toList());
        System.out.println(longWords);

        
    }
}
