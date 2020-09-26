package model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Customer {

	private String id;
	private String password;
	private String name;
	private String gender;
	private String email;
	
	public String getId() {
		return id;
	}
	public String getPassword() {
		return password;
	}
	public void addinfo(String id, String pw, String name, String gen, String em) {
		this.id = id;
		this.password = pw;
		this.name = name;
		this.gender = gen;
		this.email = em;
	}
	public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
	}
	public String getGender() {
		return gender;
	}
}
