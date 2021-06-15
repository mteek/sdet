package sdetArrays;
import java.util.*;


public class SdetArrays {

	
public static void main(String[]args) {	

		int [] thisArray; 
		thisArray = new int [5];

		thisArray[0] = 444;
		thisArray[1] = 2;
		thisArray[2] = 6;
		thisArray[3] = 99;
		thisArray[4] = 7;

		int sum = 0; 

		for(int i=0; i<thisArray.length; i+=2) {
			sum += thisArray[i];
		}
		System.out.println("the sum of thisArray:"  + sum);
		}

public static void toPower(){
	
Scanner sc = new Scanner(System.in);

int power; 
power = 2;
int [] size; 
size = new int [4];

int holdMyInt = 0;
for (int i=1; i < size.length; i++) {
	holdMyInt += (power*size[i]);
}	
	System.out.println(holdMyInt);
}
}

