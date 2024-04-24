package Java8Demo;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilterDemo {

	public static void main(String[] args) {
		int array[]={1,3,4,5,6,6,7,7};

		List<int[]> s=Arrays.asList(array).stream().filter(i->i.equals(i)).collect(Collectors.toList());
		System.out.println("dds::"+s.get(0).equals(array));

		String s1="d";
		String s2=new String("d");
		//s2=null;
		String s3=null;
		System.out.println(exactlyOneNotNull(s1,s2,s3));
	}
	public static boolean exactlyOneNotNull(Object... entries) {
		List<Object> filtered = Arrays.stream(entries)
				.filter((item)-> item!=null)
				.collect(Collectors.toList());
		return filtered.size()==1;
	}
}
