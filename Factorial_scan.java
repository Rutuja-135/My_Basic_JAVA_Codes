package basic;

import java.util.Scanner;

public class Factorial_scan {

	
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int result = 0;
		for (int i = 1 ; i<=10;i++){
			
			result = N * i ;
			System.out.println(N + " X " + i + "= "  + result);
		}
		
		
	}
}
