package Entities;

import Abstract.Entity;


public class Customer implements Entity {
	private int id;
	private String firtName ;
	private String lastName;
	private int dateOfBirth;
	private long nationalityId;
	
	
	public Customer(int id, String firtName, String lastName, int dateOfBirth, long nationalityId) {
		super();
		this.id = id;
		this.firtName = firtName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.nationalityId = nationalityId;
	
	
	}
	
	public Customer() {
		
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirtName() {
		return firtName;
	}
	public void setFirtName(String firtName) {
		this.firtName = firtName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getDateofBirth() {
		return dateOfBirth;
	}
	public void setDateofBirth(int dateofBirth) {
		this.dateOfBirth = dateofBirth;
	}
	public long getNationalityId() {
		return nationalityId;
	}
	public void setNationalityId(long nationalityId) {
		this.nationalityId = nationalityId;
	}
	
	
	}
	
	
	
	
	


