package day0425;

import java.util.Scanner;

public class CalculatorMain1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
//		3. CalculatorMain Class 
//        1. ���α׷��� �����ϸ� 1.���� 2.���� 3.���� 4.������ 5.����
//			 ����â�� ��µ� (while �� Ȱ��)
//        2. �� �޼��� ���ǿ� �°� ȣ���Ͽ� ����� ����Ѵ�. 
//            1. ���� �޼��� sum ȣ��  
//            2. ���� �޼��� subtraction ȣ�� 
//            3. ���� �޼��� multiplication ȣ�� 
//            4. ������ �޼��� division ȣ��
		
		Calculator1 calculator1 = new Calculator1();
		int num = 0;
		int num1 = 0;
		int num2 = 0;
		boolean run = true;
		while(run) {
			System.out.println("------------------------------");
			System.out.println("1.���� 2.���� 3.���� 4.������ 5.����");
			System.out.println("------------------------------");
			System.out.print("���� >");
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
				System.out.println("�����մϴ�");
				run = false;
			}else {
				System.out.println("1 ~ 5 ���ڸ� �Է� ����");
			}
		}
	}

}
