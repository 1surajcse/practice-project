import java.util.HashMap;
import java.util.Iterator;

public final class ImmutableClassDemo {
	
	private final int a;
	private final HashMap<String,String> testMap;
	public int getA() {
		return a;
	}


	

	public ImmutableClassDemo(int a, HashMap<String, String> testMap) {
		super();
		this.a = a;
		
		HashMap<String,String> tempMap=new HashMap<String,String>();
		String key;
		Iterator<String>it=testMap.keySet().iterator();
		while(it.hasNext()){
			key=it.next();
			tempMap.put(key, testMap.get(key));
		}
		this.testMap = tempMap;
		
	}


	public HashMap<String, String> getTestMap() {
		return (HashMap<String, String>) testMap.clone();
	}




	public static void main(String[] args) {
		HashMap<String,String>hm=new HashMap<String,String>(); 
		hm.put("1", "Suraj");
		hm.put("2", "Ram");
		
		ImmutableClassDemo classDemo=new ImmutableClassDemo(1, hm);
		
		classDemo.getTestMap().put("3", "Ramesh");
		
		System.out.println(classDemo.getTestMap());
		

	}

}
