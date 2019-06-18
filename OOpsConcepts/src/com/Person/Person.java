package com.Person;

public class Person {
	
private String firstName;
private String lastName;
private int age;
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	if(age<0||age>100)
	{
		this.age=0;
	}
	else
	{
	this.age = age;
	}
}
public boolean isTeen()
{
	int age=getAge();
	if(age>12&&age<20)
	{
	return true;
	}
	else
	{
		return false;
	}
}

public String getFullName()
{
	String lastname=getLastName();
	String firstname=getFirstName();
	if(lastname.equals("")&&firstname.equals(""))
	{
		return "";
	}
	else if(lastname.equals(""))
	{
		return firstname;
	}
	else if (firstname.equals(""))
	{
		return lastname;
	}
	return firstname+" "+lastname;
}
}
