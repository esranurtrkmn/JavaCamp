package kodlamaioProject;

public class InstructorManagement extends UserManagement{
	
	@Override
	public void List() {
		
		System.out.println("��retmenler listelendi");
	}
	
	
	@Override
	public void Add(User user) {
		System.out.println(user.getFirstName()+" eklendi");
	}

}
