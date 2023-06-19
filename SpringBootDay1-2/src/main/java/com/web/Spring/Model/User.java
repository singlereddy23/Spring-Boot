package com.web.Spring.Model;

public class User
{
	private Integer id;
	private String name;
	private String mailid;
	
	public Integer getId()
	{
		return id;
	}
	public void setId(Integer id)
	{
		this.id = id;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String getMailid()
	{
		return mailid;
	}
	public void setMailid(String mailid)
	{
		this.mailid = mailid;
	}
	
	public User()
	{
		super();
	}
	
	public User(Integer id, String name, String mailid)
	{
		super();
		this.id = id;
		this.name = name;
		this.mailid = mailid;
	}
	
	public String toString()
	{
		return "User [id=" + id + ", name=" + name + ", mailid=" + mailid + "]";
	}
}