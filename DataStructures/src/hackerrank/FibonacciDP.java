package hackerrank;

import java.math.BigInteger;
import java.util.Scanner;

public class FibonacciDP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in); 
		int input = Integer.parseInt(scanner.nextLine());
		BigInteger[] fib = new BigInteger[input+1];
		
		fib[0] = BigInteger.ZERO;
		fib[1] = BigInteger.ONE;
		if(input == 1)
			System.out.print(fib[0]);
		else
			System.out.print(fib[0] + " " + fib[1]);
		for(int i=2;i<input;i++){	
			fib[i] = fib[i-1].add(fib[i-2]);
			System.out.print( " " + fib[i]);
		}		
	}
}
