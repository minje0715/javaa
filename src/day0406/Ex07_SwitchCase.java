package day0406;

public class Ex07_SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 5;
		switch(num) {
		case 0: // num == 0
			System.out.println("num값이 0일 때 출력");
			break;
		case 1:	// num == 1
			System.out.println("num값이 1일 때 출력");
			break;
		case 2:	// num == 2
			System.out.println("num값이 2일 때 출력");
			break;
		default:
			System.out.println("case 조건에 없는 경우 출력");
			break;
		}
		
		String str = "파하";
		switch(str) {
		case "가나다":
			System.out.println("가나다입니다.");
			break;
		case "라마바":
			System.out.println("라마바입니다.");
			break;
		default:
			System.out.println("한글이 아닙니다.");
			break;
		}
	}

}
