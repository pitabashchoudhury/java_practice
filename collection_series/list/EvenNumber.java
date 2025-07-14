package collection_series.list;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenNumber {

    public static void main(String[] args) {

        int[] list = { 1, 2, 3, 4, 5, 6 };

        List<Integer> listL = Arrays.stream(list).boxed().collect(Collectors.toList());

        listL.stream().filter(e -> e % 2 == 0).forEach(System.out::println);

        listL.set(0, 10);
        listL.stream().filter(e -> e % 2 == 0).forEach(System.out::println);

    }
}
