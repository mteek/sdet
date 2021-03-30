package pet;

import java.util.ArrayList;
import java.io.*;


///just import classes 
///that are needed 

public class pet {

///instance variables visible 
///in pet class only
///declared in pet class
///but outside methods or constructors
///these just tell you
///about the class
	
	
private String name;

private int age;

private String location;

private String type; 


///constructors  
public pet () {}

public pet (String name, int age, String location, String type) {
	name = "Pickle";
	age = 1;
	location = "Orlando";
	type = "stray";
}

public pet(String name) {
	this.name = name;
	
}


///getters
public String getName () {
	return name;
}

public int getAge () {
	return age;
}

public String getType () {
	return type;
}

///setters

public void setName (String name)
{
	this.setName(name);
}

public void setAge (int age)
{
	this.setAge(age);
}

public void setLocation (String location)
{
	this.setLocation(location);
}

}



