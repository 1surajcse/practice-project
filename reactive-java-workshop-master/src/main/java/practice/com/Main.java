package practice.com;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Map<String, List<String>> people = new HashMap<>();
        people.put("John", Arrays.asList("555-1123", "555-3389"));
        people.put("Mary", Arrays.asList("444-2243", "555-5264"));
        people.put("Steve", Arrays.asList("555-6654", "333-3242"));

        Stream<String> result = people.entrySet().stream().flatMap(a ->
                a.getValue().stream().filter(aa -> aa.startsWith("3")));

        System.out.println(result.toList());



    }
}
