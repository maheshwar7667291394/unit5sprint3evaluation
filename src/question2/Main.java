package question2;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter id");
		int id=input.nextInt();
		System.out.println("Enter naem");
		String name=input.next();
		System.out.println("Enter address");
		String address=input.next();
		System.out.println("enter the email");
		String emsil=input.next();
		System.out.println("enter password");
		String pass=input.next();
		Student student=new Student(id, name, address, emsil, pass);
		StudentDB st=new StudentDB(student);
	 student.toString();
	
	}

}
