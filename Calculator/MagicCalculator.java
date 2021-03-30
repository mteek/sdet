package Calculator;

import java.lang.Math;

public class MagicCalculator extends calculator {
	
	
	public double sin(int x){
		return(Math.sin(x));
	}
	
	public double cosine(int x) {
		return(Math.cos(x));
	}
	
	public double tangent (int x) {
		return(Math.tan(x));
	}
	
	public double squareroot (int x) {
		return(Math.sqrt(x));
	}
	
	static int factorial(int n)
    {
        if (n == 0)
          return 1;
          
        return n*factorial(n-1);
    }

	///double square = Math.pow(num1, num2);
	///System.out.println("the square is:  " + square);
	
	///double answer1 = Math.sqrt(4); 
	///System.out.println("the sqrt: " + answer1);

	///double answer2 = Math.sin(num1);
	///System.out.println("the sin: " + answer2);
	
	
	////int answer3;
	///answer3 = Math.cos(num1);
	///System.out.println("the cos: " + answer3);
	
	
	///int answer4;
	///answer4 = Math.tan(num1);
	///System.out.println("the tan: " + answer4);
	
	
///	for (int i = 1; i <= num1; i++) {
		
///		Object factorial = ((BigInteger) factorial).multiply(BigInteger.valueOf(i));
///	}
///	System.out.println("the !: " + factorial);
	

}
