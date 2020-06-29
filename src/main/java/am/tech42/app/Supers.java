package am.tech42.app;

public class Supers{

	private char[] password;
	
	private char[] userName;

	public Supers(){}

	public Supers(char[] password, char[] userName){

		this.password = password;
		this.userName = userName;

	}

	public Supers(char[] password){

		this.password = password;

	}

	public char[] getPassword(){

		return password;

	}

	public void setPassword(char[] password){

		this.password = password;

	}

	public char[] getUserName(){

		return userName;

	}

	public void setUserName(char[] userName){

		this.userName = userName;

	}

}