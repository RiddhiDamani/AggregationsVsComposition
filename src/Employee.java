
public final class Employee {
		
	private Integer id;
	private String name;
	private String email;
	
	private Address address;   // Employee class is having a reference (address) of Address class
							   // This is Aggregation.
	public Employee(Integer id, String name, String email, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.address = address;
	}

	public Integer getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public Address getAddress() {
		return address;
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + " , name = " + name + ", email = " + email + ", address = " + address + "]"; 
	}
	
}
