import java.util.ArrayList;
import java.util.List;

public class DuplicateNumber {
public static void main(String a[]){
List<Integer> numbers = new ArrayList<Integer>();
numbers.add(10);
for(int i=1;i<30;i++){
numbers.add(i);
}
numbers.add(30);
numbers.add(25);
finddupe(numbers);
}
private static void finddupe(List<Integer> numbers){
List<Integer> withoutdupes = new ArrayList<Integer>();
for(Integer i:numbers){
if(withoutdupes.contains(i)) System.out.println( "This is duplicate"+i);
else withoutdupes.add(i);
}
}}
