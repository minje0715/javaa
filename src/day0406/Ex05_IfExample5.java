package day0406;

import java.util.Scanner;

public class Ex05_IfExample5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int grade = 0;
		int score = 0;
		System.out.print("학년을 입력하세요: ");
		grade = scan.nextInt();
		System.out.print("점수를 입력하세요: ");
		score = scan.nextInt();
		scan.close();
		
//		if(grade >= 1 && grade <= 4 && score >= 0 && score <= 100) {
//			if (grade == 4) {
//				if (score >= 70) {
//					System.out.println(grade + "학년 합격");
//				} else {
//					System.out.println(grade + "학년 불합격");
//				}
//			} else {
//				if (score >= 60) {
//					System.out.println(grade + "학년 합격");
//				} else {
//					System.out.println(grade + "학년 불합격");
//				}
//			}
//		} else {
//			System.out.println("학년이 1~4학년이 아니거나, 점수가 0~100점 사이가 아닙니다.");
//		}
		
		if(score >= 60) {
			if(grade != 4) {
				System.out.println("합격");
			} else if(score >= 70) {
				System.out.println("합격");
			} else {
				System.out.println("불합격");
			}
		} else {
			System.out.println("불합격");
		}
	}

}
