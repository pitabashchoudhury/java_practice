package collection_series.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class RemoveDuplicate {

    public static void main(String[] args) {
        List<Integer> raw = new ArrayList<>(Arrays.asList(1, 3, 2, 1, 4, 3, 6, 4, 5, 8, 2, 1));
        List<Integer> uniqueData = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();

        for (Integer ss : raw) {
            if (map.containsKey(ss)) {
                continue;
            } else {
                map.put(ss, map.getOrDefault(map, ss));
                uniqueData.add(ss);
            }
        }

        uniqueData.stream().forEach(System.out::println);

        System.out.println("stream API");

        List<Integer> p = raw.stream().distinct().collect(Collectors.toList());

        p.stream().forEach(System.out::println);

    }

}
