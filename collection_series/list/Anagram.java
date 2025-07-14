package collection_series.list;

import java.util.stream.Collectors;

import java.util.Map;

public class Anagram {

    public static boolean checkAnagram(String str1, String str2) {

        if (str1.length() != str2.length()) {

            return false;
        }

        Map<Character, Long> sp = str1.toLowerCase().chars().mapToObj(e -> (char) e)
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()));
        Map<Character, Long> sq = str2.toLowerCase().chars().mapToObj(e -> (char) e)
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()));

        return sp.equals(sq);
    }

    public static void main(String args[]) {

        String str1 = "silent";
        String str2 = "listen";

        boolean s = checkAnagram(str1, str2);

        System.out.println(s);

    }
}
