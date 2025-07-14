package string;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Problem1 {

    public static void main(String[] args) {

        Predicate<String> predicate = new Predicate<String>() {
            @Override
            public boolean test(String t) {
                return t.length() < 3;
            }
        };

        List<String> values = List.of("s", "fh", "dggr", "sdshdfs", "t", "sddsff", "asdhgewyfwe");

        List<String> greater = values.stream().filter(predicate).collect(Collectors.toList());

        System.out.println(greater);
    }
}
