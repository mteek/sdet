package Calculator;

import java.lang.Math;
import java.math.BigInteger;

public class calculator {
public static void main (String[]args) {
int num1 = 4;
int num2 = 4;
BigInteger factorial = BigInteger.ONE;

	
	int add;
	add = Math.addExact(num1, num2);
	System.out.println("the sum is: " +add);
	
	int subtract;
	subtract = Math.subtractExact(num1, num2);
	System.out.println("the difference is:  " + subtract);
	
	int multiply;
	multiply = Math.multiplyExact(num1, num2);
	System.out.println("the product is:  " + multiply);
	
	
	int divide;
	divide = Math.floorDiv(num1, num2);
	System.out.println("the remainder is:  "  + divide);

	double square;
	square = Math.pow(num1, num2);
	System.out.println("the square is:  " + square);
	
	double answer1 = Math.sqrt(num1);
	System.out.println("the sqrt: " + answer1);


	double answer2;
	answer2 = Math.sin(num1);
	System.out.println("the sin: " + answer2);
	
	
	double answer3;
	answer3 = Math.cos(num1);
	System.out.println("the cos: " + answer3);
	
	
	double answer4;
	answer4 = Math.tan(num1);
	System.out.println("the tan: " + answer4);
	
	
	for (int i = 1; i <= num1; i++) {
		
		factorial = factorial.multiply(BigInteger.valueOf(i));
	}
	System.out.println("the !: " + factorial);
	}
}



