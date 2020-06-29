package am.tech42.app;

public class Student extends Supers{

	private String firstName;
	private String lastName;
	private int gpa;

	public Student(){

	}

	public Student(char [] password, char[] userName, String firstName, String lastName, int gpa){

		super(password, userName);
		this.firstName = firstName;
		this.lastName = lastName;
		this.gpa = gpa;

	}

	public Student(char [] password, String firstName, int gpa){

		super(password);
		this.firstName = firstName;
		this.gpa = gpa;

	}

	public Student(char [] password, String firstName){

		super(password);
		this.firstName = firstName;

	}

	

	public String getFirstName(){

		return firstName;

	}	

	public void setFirstName(String firstName){

		this.firstName = firstName;

	}

	public String getLastName(){

		return lastName;

	}

	public void setLastName(String lastName){

		this.lastName = lastName;

	}

	public int getGpa(){

		return gpa;

	}

	public void setGpa(int gpa){

		this.gpa = gpa;

	}

}