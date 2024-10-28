import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Comparator;

class Employee implements Comparator<Employee>,Cloneable
{
	@Override
	public String toString() {
		return "Employee [name=" + name + ", dept=" + dept + "]";
	}
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	private String dept;
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	public Employee()
	{
		System.out.println("inside constructor");
	}
	@Override
	public int compare(Employee arg0, Employee arg1) {
	return arg0.name.compareTo(arg1.name);
	}
}
public class Objectcreationways {

	public static void main(String[] args) throws CloneNotSupportedException, InstantiationException, IllegalAccessException, ClassNotFoundException, FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		Employee emp1=new Employee();
		
		//using clone()
		
		//Employee emp=(Employee)emp1.clone();
		
		Employee e=(Employee) emp1.clone();
		
		//using Class class
		
		Employee emp2=(Employee) Class.forName("Employee").newInstance();
		
		Employee e2=(Employee) Class.forName("Employee").newInstance();
		
		//using constructor
		
		//Constructor<Employee>constructor=Employee.class.getConstructors();
		
//Employee e=constructor.newInstance();
//using deserialztion
ObjectInputStream obs=new ObjectInputStream(new FileInputStream("text.obj"));
Employee em=(Employee) obs.readObject();

ObjectInputStream ois=new ObjectInputStream(new FileInputStream("text.obj"));
Employee e1=(Employee) ois.readObject();


	}

}
