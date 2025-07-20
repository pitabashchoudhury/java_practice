package string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem2 {
    public static void main(String[] args) {
        
        List<String> raw= new ArrayList<>(Arrays.asList("sas","india","england","rusk"));

        List<String> modified=  raw.stream().map(e->e.toUpperCase()).toList();

        System.out.println(modified);
    }
}
