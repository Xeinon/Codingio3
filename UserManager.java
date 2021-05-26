package Codingio;

public class UserManager {

	public void add(User user) {
		System.out.println("Kullanýcý eklendi : " + user.getFirstName());
	}
	
	public void delete(User user) {
		System.out.println("Kullanýcý silindi : " + user.getFirstName());
	}
	public void update(User user) {
		System.out.println("Kullanýcý güncellendi : " + user.getId() + " " + user.getFirstName());
	}
	public void addMulti(User[] users) {
		
		for(User user : users) {
			add(user);
		}
	}
	public void getUser(User[] users) {
		
		for(User user : users) {
			System.out.println(user.getFirstName());
		}
	}
	
}
