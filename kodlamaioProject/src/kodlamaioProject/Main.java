package kodlamaioProject;

public class Main {

	public static void main(String[] args) {
		
		Student student1=new Student();
		
		Instructor instructor1=new Instructor();
		
		
		student1.setId(1);
		student1.setFirstName("Esranur");
		student1.setLastName("T�rkmen");
		student1.seteMail("turkmenesranur@gmail.com");
		student1.setStudentNo(327);
	
		
		
		instructor1.setId(2);
		instructor1.setFirstName("Engin");
        instructor1.setLastName("Demiro�");
        instructor1.seteMail("engindemirog@gmail.com");
        instructor1.setSalary(100000);
		
        
    	
		Student[] students= new Student[]{student1};
		
		for(Student student: students) {
			System.out.println("��rencinin ad�:"+student.getFirstName());
			System.out.println("��rencinin soyad�:"+student.getLastName());
			System.out.println("��rencinin mail adresi:"+student.geteMail());
			System.out.println("��rencinin numaras�:"+student.getStudentNo());
		}
		
		
		StudentManager studentManager=new StudentManager();
		studentManager.Add(student1);
		studentManager.List();
		
		
		
        
        Instructor[] instructors=new Instructor[]{instructor1};
        
        for(Instructor instructor:instructors) {
        	System.out.println("\n��retmenin ad�:"+instructor.getFirstName());
        	System.out.println("��retmenin soyad�:"+instructor.getLastName());
        	System.out.println("��retmenin mail adresi:"+instructor.geteMail());
        	System.out.println("��retmenin maa��:"+instructor.getSalary());
        	
        }
        
        InstructorManagement instructorManager=new InstructorManagement();
        
        instructorManager.Add(instructor1);
        instructorManager.List();
		
       
        
	
		
		
	}

}
