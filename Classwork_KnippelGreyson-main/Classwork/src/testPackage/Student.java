package testPackage;

public class Student
{
	private int id;
	private String name;
	private String course;
	private double score;

	public Student(int id, String name, String course, double score)
	{
		this.id = id;
		this.name = name;
		this.course = course;
		this.score = score;
	}

	public void addGrade(double adds)
	{
		this.score = this.score + adds;
	}

	public void changeCourse(String course)
	{
		this.course = course;
		this.score = 0;
	}

	public void endCourse()
	{
		this.course = "";
	}

	public boolean amActive()
	{
		return (this.course.equals("") == false);
	}
	
	public int getID ()
	{
		return this.id;
	}
	
	public String getName ()
	{
		return this.name;
	}
	
	public String getCourse ()
	{
		return this.course;
	}
	
	public double getScore ()
	{
		return this.score;
	}

}