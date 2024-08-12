package testPackage;

public class MainStudent 
{
	public static void main (String[] args)
	{
		Student s1 = new Student (12345, "Greyson", "APCS", 0.0);
		Student s2 = new Student (34222, "Tom", "Personal Finance", 0.0);
		
		System.out.println(s1.getID() + " " + s1.getName() + " " + s1.getCourse() + " " + s1.getScore());
		
		
		s1.addGrade(90);
		System.out.println(s1.getID() + " " + s1.getName() + " " + s1.getCourse() + " " + s1.getScore());
		
		s1.changeCourse("AP Physics 1");
		System.out.println(s1.getID() + " " + s1.getName() + " " + s1.getCourse() + " " + s1.getScore());
		
		s1.endCourse();
		System.out.println(s1.getID() + " " + s1.getName() + " " + s1.getCourse() + " " + s1.getScore());
	}
}
