package dataStruc;
import java.util.LinkedList; 
import java.util.Arrays;

public class dataStruc {

public static void main (String[] args) {
	
	// this is a for-each loop
	int sum = 0; // we put this here 
					// so we can refer back
					// to it; it's in the scope
	int [] sumArray = { 4, 4, 4, 4};
	for( int value: sumArray) {
		sum += value;
		System.out.println("the sum:  "+sum + "   the value:  " + value);
	}
{
	double [] givenArray = {1 , 5, 6, 5, 4, 1};
	double maximum = givenArray[0];
	int index = 0;
	for(int i = 1; i<givenArray.length; i++) 
	///i can be anything u want 
	/// i just stands for index 
	/// so when my loop iterates through it
	/// 
	{
		if(givenArray[i]> maximum) {
			// if my array is greater than 1
			// then i want to print out  
			// the index
			//it's good to sent your print ln 
			// to something that helps validate
			// what you're trying to do 
			// code for purpose not to fix errors
			maximum = givenArray[i];
			index = i; 
		}
	}
	System.out.println(index);
	

	
	
	
	
	
	///double [] givenArray = {1 ,2 , 3, 4 ,5, 6};
	//double maximum = givenArray[0];
	
	///in t index = 0; 
	
	///for( in t i = 1 ; i<givenArray.length>; i++) {
	///if(givenArray[i]> maximum) {
	///	maximum = givenArray[i];
	///index = i;

	
}
}
}
