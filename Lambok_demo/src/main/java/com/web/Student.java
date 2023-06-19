package com.web;

import java.util.Objects;

public class Student
{
	private Integer id;
	private String name;
	private String email;
	private String address;
	
	public Integer getId()
	{	return id;
	}
	public void setId(Integer id)
	{	this.id = id;
	}
	public String getName()
	{	return name;
	}
	public void setName(String name)
	{	this.name = name;
	}
	public String getEmail()
	{	return email;
	}
	public void setEmail(String email)
	{	this.email = email;
	}
	public String getAddress()
	{	return address;
	}
	public void setAddress(String address)
	{	this.address = address;
	}
	
	public Student()
	{	super();
	}
	
	public Student(Integer id, String name, String email, String address)
	{	super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.address = address;
	}
	
	public int hashCode()
	{
		return Objects.hash(address, email, id, name);
	}
	public boolean equals(Object obj)
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(address, other.address) && Objects.equals(email, other.email)
				&& Objects.equals(id, other.id) && Objects.equals(name, other.name);
	}
	
	public String toString()
	{
		return "Student [id=" + id + ", name=" + name + ", email=" + email + ", address=" + address + "]";
	}
}