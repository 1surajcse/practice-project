/***
 * 
 * @author stiwari
 * 
 * 
 * What is Java String Pool?
As the name suggests, String Pool in java is a pool of Strings stored in Java Heap Memory. We know that String is special
 class in java and we can create String object using new operator as well as providing values in double quotes.


 1.String pool is possible only because String is immutable in java, this way Java Runtime saves a lot of java heap space
  because different String variables can refer to same String variable in the pool. If String would not have been 
  immutable, then String interning would not have  been possible because if any variable would have changed the value, 
  it would have been reflected to other variables also.

2.If String is not immutable then it would cause severe security threat to the application. For example, database username,
 password are passed as String to get database connection and in socket programming host and port details passed as String. 
 Since String is immutable it’s value can’t be changed otherwise any hacker could change the referenced value to cause security
  issues in the application.

3.Since String is immutable, it is safe for multithreading and a single String instance can be shared across different threads. This avoid the usage of synchronization for thread safety, Strings are implicitly thread safe.
Strings are used in java classloader and immutability provides security that correct class is getting loaded by Classloader. For example, think of an instance where you are trying to load java.sql.Connection class but the referenced value is changed to myhacked.Connection class that can do unwanted things to your database.

4.Since String is immutable, its hashcode is cached at the time of creation and it doesn’t need to be calculated again. This makes it a great candidate for key in a Map and it’s processing is fast than other HashMap key objects. This is why String is mostly used Object as HashMap keys.
Above are some of the reasons I could think of that shows benefits of String immutability. It’s a great feature of Java String class and makes it special.
 *
 */
public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			String s1="demo";
		String s2="demo";
		String s3=new String("demo");
		String s4=s3;

		System.out.println(s1==s2);//true
		System.out.println(s1.equals(s2));//true
		System.out.println(s1==s3);//false
		System.out.println(s1.equals(s3));//true
		System.out.println(s3==s4);//true;
		System.out.println(s3.equals(s4));//true
		System.out.println(s4.equals(s1));//true
		 

		//String intern Method()
/*		String s1 = "Test";
		String s2 = "Test";
		String s3 = new String("Test");
		final String s4 = s3.intern();
		System.out.println(s1 == s2);//True
		System.out.println(s2 == s3);//false
		System.out.println(s3 == s4);//false
		System.out.println(s1 == s3);//false
		System.out.println(s1 == s4);//true
		System.out.println(s1.equals(s2));//true
		System.out.println(s2.equals(s3));//true
		System.out.println(s3.equals(s4));//true
		System.out.println(s1.equals(s4));//true
		System.out.println(s1.equals(s3));//true
*/	}

}

/*What is String Interning?

String Interning is a method of storing only one copy of each distinct String Value, which must be immutable.

In Java, String class has a public method intern() that returns a canonical representation for the string object.
 Java’s String class privately maintains a pool of strings, where String literals are automatically interned.


 When the intern() method is invoked on a String object it looks the string contained by this String object in the pool, 
 if the string is found there then the string from the pool is returned. Otherwise, 
 this String object is added to the pool and a reference to this String object is returned.


 The intern() method should be used on strings constructed with new String() in order to compare them by == operator.
 
 
 
 Why and When to Intern ?

Though Java automatically interns all Strings by default, remember that we only need to intern strings when 
they are not constants, and we want to be able to quickly compare them to other interned strings. The intern() method 
should be used on strings constructed with new String() in order to compare them by == operator.
 */