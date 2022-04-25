package day0425;

import java.util.Scanner;

public class CalculatorMain1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
//		3. CalculatorMain Class 
//        1. ÇÁ·Î±×·¥À» ½ÇÇàÇÏ¸é 1.µ¡¼À 2.»¬¼À 3.°ö¼À 4.³ª´°¼À 5.Á¾·á
//			 ¼±ÅÃÃ¢ÀÌ Ãâ·ÂµÊ (while ¹® È°¿ë)
//        2. °¢ ¸Þ¼­µå Á¤ÀÇ¿¡ ¸Â°Ô È£ÃâÇÏ¿© °á°ú¸¦ Ãâ·ÂÇÑ´Ù. 
//            1. µ¡¼À ¸Þ¼­µå sum È£Ãâ  
//            2. »¬¼À ¸Þ¼­µå subtraction È£Ãâ 
//            3. °ö¼À ¸Þ¼­µå multiplication È£Ãâ 
//            4. ³ª´°¼À ¸Þ¼­µå division È£Ãâ
		
		Calculator1 calculator1 = new Calculator1();
		int num = 0;
		int num1 = 0;
		int num2 = 0;
		boolean run = true;
		while(run) {
			System.out.println("------------------------------");
			System.out.println("1.µ¡¼À 2.»¬¼À 3.°ö¼À 4.³ª´°¼À 5.Á¾·á");
			System.out.println("------------------------------");
			System.out.print("¼±ÅÃ >");
			num = scan.nextInt();
			if(num == 1) {
				num1 = scan.nextInt();
				num2 = scan.nextInt();
				calculator1.sum(num1, num2);
			}else if(num == 2) {
				num1 = scan.nextInt();
				num2 = scan.nextInt();
				calculator1.subtraction(num1, num2);	
			}else if(num == 3) {
				num1 = scan.nextInt();
				num2 = scan.nextInt();
				int multiplication = calculator1.multiplication(num1, num2);
				System.out.println(multiplication);
			}else if(num == 4) {
				int result = calculator1.division();
				System.out.println(result);
			}else if (num ==5){
				System.out.println("Á¾·áÇÕ´Ï´Ù");
				run = false;
			}else {
				System.out.println("1 ~ 5 ¼ýÀÚ¸¸ ÀÔ·Â °¡´É");
			}
		}
	}

}
