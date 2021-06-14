package javaTypesVarsBranching;


import java.util.Scanner;


public class JavaTypesVarsBranching {
	
	Scanner myScan;
	String name = "";
	String reply = "";
	
	static int ageLimit = 18;
	int age = 0; 
	
	
	public static void main (String []args) {
		
		
		Scanner myScan = new Scanner(System.in);
		
		
		System.out.println("Hi! Please type your name:  ");
		String name = myScan.nextLine();
		
		System.out.println("Great. How old are you?:   ");
		int age = Integer.parseInt(myScan.nextLine());
		
		if(age < ageLimit) {
			System.out.println("18 years or older, Sorry!");
			System.exit(0);
		} else {
			
			
		System.out.printf("   hi %s", name);
		
		System.out.println("I am going to tell you a joke, ok?:     ");
		String reply = myScan.nextLine();
		
		
		System.out.println("What do you call a pig that does karate?");
		String answer = myScan.nextLine();
		
		System.out.println("pork chop");
		
		
		}
		
		
		
		
	}
	
	

}
