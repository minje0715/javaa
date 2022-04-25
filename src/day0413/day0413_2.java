package day0413;

import java.util.Scanner;

public class day0413_2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] intArray = null; // 학생수
		int stu = 0; // 학생점수
		int max = 0; // 최댓값
		int score = 0; // 입력하는 값
		int temp = 0;	
		double vudrbs = 0; // 평균
		int sum = 0; // 합계
		int i = 0; // 점수
		
		boolean run = true;
		while (run) {
			System.out.println("-----------------------------------");
			System.out.println("1.학생수 2.점수입력 3.점수리스트 4.분석 5.종료");
			System.out.println("-----------------------------------");
			System.out.print("선택 >");
			score = scan.nextInt();
			if (score == 1) {
				System.out.print("학생수 : ");
				stu = scan.nextInt();
				intArray = new int[stu];
			} else if (score == 2) {
				for (i = 0; i < intArray.length; i++) {
					System.out.print((i + 1) + "번째 학생 점수입력 : ");
					intArray[i] = scan.nextInt();
				}
			} else if (score == 3) {
				for (i = 0; i < intArray.length; i++) {
					System.out.println((i + 1) + "번째 학생 점수 : " + intArray[i]);
				}
			} else if (score == 4) {
				for (i = 0; i < intArray.length; i++) {
					if (intArray[i] > max) {
						max = intArray[i];
					}
					sum += intArray[i];
				}
				vudrbs = sum / intArray.length;
				System.out.println("최고점수 : " + max);
				System.out.println("평균점수 : " + vudrbs);
				for (i = 0; i <= intArray.length; i++) {
					for (int j = i + 1; j < intArray.length; j++) {
						if (intArray[i] < intArray[j]) {
							temp = intArray[j];
							intArray[j] = intArray[i];
							intArray[i] = temp;
						}
					}
					System.out.println(intArray[i]);
				}
			}
		}
	}
}