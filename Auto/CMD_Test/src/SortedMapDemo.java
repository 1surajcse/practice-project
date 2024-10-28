//package CMD_Test.src;
//
//import java.util.Map.Entry;
//
///***
// * Create a Hashmap with value
// * get the set of entryset
// * Set<Map.Entry<String,Emplyoee>hm=map.entryset>
// * Make the list Of entry set
// *
// * List<Map.Entry<String,Employee>ll=new Arraylist<<Map.EntrySet>>
// *
// * Collection.sort(ll,new comparator(Map.Entry<String,Emp>())){
// * }
// * @author stiwari
// *
// */
//
//public class SortedMapDemo {
//
//	public static void main(String[] args) {
//
//Employee employee=new Employee();
//		employee.setName("Suraj");
//		employee.setDept("CSE");
//
//		Employee employee1=new Employee();
//		employee1.setName("Amar");
//		employee1.setDept("CSE");
//
//		Employee employee2=new Employee();
//		employee2.setName("Ram");
//		employee2.setDept("EC");
//
//		HashMap<Integer,Employee>map=new HashMap<>();
//		map.put(2, employee);
//		map.put(3,employee1);
//		map.put(1, employee2);
//
//		System.out.println(map);
//
//		Set<Map.Entry<Integer, Employee>>set=map.entrySet();
//
//
//		/*for(Map.Entry<Integer, String>m:set){
//			System.out.println(m.getKey()+":"+m.getValue());
//		}*/
//
//		List<Map.Entry<Integer, com.jasperImp.com.jasperDemo.entity.Employee>>ll =new ArrayList<Map.Entry<Integer, com.jasperImp.com.jasperDemo.entity.Employee>>(set);
//
//		//ll.sort(Comparator.comparing(Map.Entry::getValue));
//
//		Collections.sort(ll,new Comparator<Map.Entry<Integer, com.jasperImp.com.jasperDemo.entity.Employee>>() {
//
//			@Override
//			public int compare(Entry<Integer, Employee> arg0, Entry<Integer, Employee> arg1) {
//
//				return arg0.getValue().getName().compareTo(arg1.getValue().getName());
//			}
//		}
//
//				);
//
//		LinkedHashMap<Integer, com.jasperImp.com.jasperDemo.entity.Employee>mm=new LinkedHashMap<>();
//
//		for(Map.Entry<Integer, com.jasperImp.com.jasperDemo.entity.Employee>m:ll)
//
//		{
//			mm.put(m.getKey(), m.getValue());
//		}
//
//		for(Map.Entry<Integer,Employee>ms:mm.entrySet()){
//			System.out.println(ms.getKey()+"::"+ms.getValue().getName());
//		}
//
//	}
//
//
//
//}
