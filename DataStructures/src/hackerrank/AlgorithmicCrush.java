package hackerrank;

import java.util.Scanner;

public class AlgorithmicCrush {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in); 
		String[] input1 = scanner.nextLine().split(" ");
		
		long[] elements = new long[Integer.parseInt(input1[0])];
		int m = Integer.parseInt(input1[1]);
		int start,end;
		long value = 0;
		long max = 0;
		
		for(int i=1;i<=m;i++)
		{
			String[] input2 = scanner.nextLine().split(" ");
			start = Integer.parseInt(input2[0]);
			end = Integer.parseInt(input2[1]);
			value  = Long.parseLong(input2[2]);
			/*
			for (int j=start-1;j<end;j++){
				elements[j] = elements[j] + value;
			}
			*/
			elements[start-1] += value;
			if(end <elements.length)
				elements[end] -= value;
		}
		
		long sum=0;
		for(int i = 0; i<elements.length; i++){
			sum = sum + elements[i];
			if(max < sum)
				max = sum;
		}
		System.out.println(max);		
	}

}
