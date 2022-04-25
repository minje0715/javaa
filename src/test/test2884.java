package test;

import java.util.Scanner;

public class test2884 {

	public static void main(String[] args) {
		
		 
		Scanner scan = new Scanner(System.in);
		int num1 = 0;
		int num2 = 0;
		int sum = 0;
		
		while((num1 = scan.nextInt()) != 0){
			sum += num1;
			if(num1 != 0) {
				System.out.println(num1);
			}else {
				System.out.println("Á¾·á");
			}
		}
	
	}

}
