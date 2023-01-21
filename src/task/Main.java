package task;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n;
		long factorial = 1;
		
		System.out.println("Enter integer n where 4 < n < 16: ");
		n = sc.nextInt();
		
		if (4 < n && n < 16) {
			
			System.out.print("Factorial n = ");
			
			for (int i = n; i >= 1; i--) {
				
				factorial = factorial * i;
				
				if (i == 1) {
					System.out.print(i + " =");
				} else {
					System.out.print(i + " * ");
				}
				
			}
			
			System.out.print(" " + factorial);
			
		} else {
			
			System.out.println("Integer n must be more than 4 and less than 16 !");
			
		}
		
	}

}
