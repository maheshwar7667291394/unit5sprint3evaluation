package question2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class StudentDB {
	
	Student studentsData;
	
	
		public StudentDB(Student studentsData) {
		super();
		this.studentsData = studentsData;
	}


		public void addStudent(Student student) {
			File file=new File("dataBase.txt");
			try {
				FileWriter fw=new FileWriter(file);
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			
		}

}
