package bean;

public class Student 
{
	private int id;
	private String name;
	private String grade;
	
	
	public Student()
	{}
	
	//Getter Setter Methods
	public int getId()
	{
		return id;
	}
	public void setId(int id)
	{
		this.id = id;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public String getGrade()
	{
		return grade;
	}
	
	public void setGrade(String grade)
	{
		this.grade = grade;
	}
	
	//toString()
	public String toString()
	{
		return "Student [id=" + id + ",name=" + name + ",grade=" + grade +"]";
		
	}
}
