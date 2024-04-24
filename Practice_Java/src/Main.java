import com.sample.dto.Employee;
import com.sample.dto.ImmutableClassSample;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.add(4);


        ImmutableClassSample immutableClassSample = new ImmutableClassSample(1, integers);
        immutableClassSample.getList().add(5);
        System.out.println(immutableClassSample.getList());
        //  immutableClassSample.age=5;

        //System.out.println( immutableClassSample.age);

//        Optional<String> ab = Optional.ofNullable("");
//
//    ab.ifPresentOrElse(abb->
//            System.out.println(abb),()-> System.out.println("w"));
//
//
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "Ram", 32));
        employees.add(new Employee(2, "RamSaran", 22));
        employees.add(new Employee(3, "Hari", 25));
        employees.add(new Employee(4, "Ram", 33));
        employees.add(new Employee(4, "Krishna", 25));
        Map<String, List<Employee>> maps = employees.stream().collect(Collectors.groupingBy(e -> e.getName(), Collectors.toList()));
        System.out.println(maps);

//
//        //
//         Map<Integer,String> empMap=employees.stream().collect(Collectors.toMap(Employee::getId,Employee::getName,(oldVal,newVal)->oldVal));
//
//        System.out.println(empMap);
//     //   int max=employees.stream().mapToInt(Employee::getAge).summaryStatistics().getMax();
//
//       // System.out.println(max);
//        List<Integer> emps = employees.stream().map(e -> e.getAge())
//                .collect(Collectors.toList());
//
//        emps.stream().skip(1).limit(2).forEach(System.out::println);
//
//
//
        //Sorting of a map

        Map<String, Integer> unsortMap = new HashMap<>();
        unsortMap.put("z", 10);
        unsortMap.put("b", 5);
        unsortMap.put("a", 6);
        unsortMap.put("c", 20);
        unsortMap.put("d", 1);
        unsortMap.put("e", 7);
        unsortMap.put("y", 8);
        unsortMap.put("n", 99);
        unsortMap.put("g", 50);
        unsortMap.put("m", 2);
        unsortMap.put("f", 9);

        System.out.println("Original...");
        System.out.println(unsortMap);
        Map<String, Integer> result2 = new LinkedHashMap<>();
//        unsortMap.entrySet().
//
//    stream().
//
//    sorted(Map.Entry.comparingByValue()).
//
//    forEachOrdered(x->result2.put(x.getKey(),x.getValue()));
//        System.out.println("results...");
//        System.out.println(result2);

        Map<String, Integer> newMap = unsortMap.entrySet().stream().sorted(Map.Entry.comparingByKey()).
                collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (oldval, newval) -> oldval, LinkedHashMap::new));

        System.out.println(newMap);
//        String a=null;
//        String b="Suraj";
//        // Difference between orElse or orElseGet  is that even if you pass the null value orElse will called
//        // but orElseGet will not get called so orElseGet is better in performance
//        // String ops = Optional.ofNullable(b).orElse(callMe());
//        String ops = Optional.ofNullable(a).orElseThrow(()-> {throw new IllegalArgumentException("The data is not present");});
//        System.out.println(ops);
//
//
//
//
//
//
//
//
//    }
//
//    public  static String callMe(){
//        System.out.println("I am called");
//        return "Default value";
//    }
    }
}
