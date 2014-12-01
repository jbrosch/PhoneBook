package code.myphonebookpak;


import java.io.Serializable;

import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "phonebook")
public class PhoneBook implements Serializable {

	private String number;
	private String name;
	private String phoneType;
	private String email;
	private String address;

	public PhoneBook() {

	}

	public PhoneBook(String name, String number, String phoneType, String email, String address) {
		this.name = name;
		this.number = number;
		this.phoneType = phoneType;
		this.email = email;
		this.address = address;
		
	}

	@Id
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}
	
	public String getPhoneType(){
		return phoneType;
	}
	
	public void setPhoneType(String phoneType){
		this.phoneType = phoneType;
	}
	
	public String getEmail(){
		return email;
	}
	
	public void setEmail(String email){
		this.email=email;
	}
	
	public String getAddress(){
		return address;
	}
	
	public void setAddress(String address){
		this.address=address;
	}
}