package day0406;

import java.util.Scanner;

public class Ex08_SwitchCaseExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String str = "";
		System.out.print("영어단어를 입력하세요: ");
		str = scan.next();
		scan.close();
		
		switch(str){
		case "desk":
			System.out.println("책상");
			break;
		case "chair":
			System.out.println("의자");
			break;
		case "monitor":
			System.out.println("모니터");
			break;
		case "mouse":
			System.out.println("마우스");
			break;
		default:
			System.out.println("사전에 없는 단어입니다.");
			break;
		}
	}

}
