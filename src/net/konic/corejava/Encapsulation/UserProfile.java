package net.konic.corejava.Encapsulation;
/*
Q9. Email Validation

Question:
Create a UserProfile class with private email.
Email must contain @.
Input:
Enter Email: usergmail.com
Output:
Invalid email
*/

public class UserProfile {

	private String email;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		if (email.contains("@")) {
			this.email = email;
			System.out.println("Email: " + email);

		} else {
			System.out.println("Invali Email");
		}
	}

	public static void main(String[] args) {
		UserProfile obj = new UserProfile();
		obj.setEmail("use@rgmail.com");
		String email = obj.getEmail();

	}

}
