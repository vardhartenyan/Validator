package am.tech42.app;

import am.tech42.library.Library;

public class App{

	public static void main(String[] args) throws Exception {

		Student student = new Student("johnsmith".toCharArray(), "Smith", -50);
		System.out.println(Library.validate(student));
        		

	}

}