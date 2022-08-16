package question1;

import java.io.File;
import java.io.IOException;

public class Main {
	public static void main(String[] args) {
		File file =new File("student.txt");
		try {
			if(file.createNewFile()) {
				System.out.println("new file is created");
			}
			else {
				System.out.println("file is already created");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
