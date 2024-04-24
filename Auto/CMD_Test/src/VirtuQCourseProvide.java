
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class VQCourse {
    private String courseName;
    public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public int getCourseID() {
		return courseID;
	}
	public void setCourseID(int courseID) {
		this.courseID = courseID;
	}
	private int courseID;
} public class VirtuQCourseProvide {

    public static void main(String[]args) {
        VQCourse course1 = new VQCourse();
        course1.setCourseID(2);
        VQCourse course2 = course1;
        final List<String> modifiable = new ArrayList<String>();
        modifiable.add("Java");
        modifiable.add("is");

        final List<String> unmodifiable = Collections.unmodifiableList(modifiable);
        System.out.println("Before modification: " + unmodifiable);

        modifiable.add("the");
        modifiable.add("best");
     // unmodifiable.add("Me if you can");
        System.out.println("After modification: " + unmodifiable);
        
        
    

         System.out.println("course1.courseID = " + course1.getCourseID() +
                            ", course2.courseID = " + course2.getCourseID());
}}