package Codingio;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student1 = new Student(1,"Ali","Çel","emailolsun", 12345,"ögrenci1","Ankara");
		Student student2 = new Student(2,"Veli","Yor","emailoslun",1222,"öğrenci2","Sakarya");
		
		Instructor instructor = new Instructor(10,"Engin","Demirog","emailolsun", 123456,"Ogretmen");
		
		
		UserManager userManager = new UserManager();
		//userManager.add(student1);
		//userManager.add(student2);
		//userManager.add(instructor);
		User[] user ={student1, student2, instructor};
		userManager.addMulti(user);
		
		System.out.println("Kullanıcılar listelendi:");
		User[] users= new User[] {student1, student2, instructor};
		
		userManager.getUser(users);
	
		
	}

}
