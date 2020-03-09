
public class Person {
	String id;
	String firstName;
	String lastName;
	String email;
	String gender;
	String ip;
	
	public Person(String id, String firstName, String lastName, String email,
			String gender, String ip) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.gender = gender;
		this.ip = ip;
	}
	
	public String toDelimitedString(String delimiter) {
		
		StringBuilder sb = new StringBuilder();
		sb.append(this.id);
		sb.append(delimiter);
		sb.append(this.firstName);
		sb.append(delimiter);
		sb.append(this.lastName);
		sb.append(delimiter);
		sb.append(this.email);
		sb.append(delimiter);
		sb.append(this.gender);
		sb.append(delimiter);
		sb.append(this.ip);
		sb.append(delimiter);
		
		return sb.toString();
		
		
	}
	
	
}




