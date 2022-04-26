package day0425_1;

import java.util.Scanner;

public class Member {
 Scanner scan = new Scanner(System.in);
//	3. 객체 프로그래밍 연습(회원예제)
//    1. 회원은 회원번호, 아이디, 비밀번호, 이름, 전화번호, 나이 정보를 가진다. 
//    2. 주요기능 
//        1. 회원가입(save)
//            1. 회원가입시 두가지 방법이 있음. 
//                1. 객체를 만들 때 모든 정보를 매개변수로 전달하여 필드값 지정하기 
//                2. 객체를 만들고 난 후 필드값을 각각 지정하기   

	long number;
	String memberId;
	String memberPw;
	String memberName;
	String memberPhone;
	int memberAge;
	
	//기본생성자
	Member(){
		
	}
	// 모든 필드를 매개변수로 하는 생성자
	Member(long number, String memberId, String memberPw, String memberName,
			String memberPhone, int memberAge) {
		this.number= number;
		this.memberId = memberId;
		this.memberPw = memberPw;
		this.memberName = memberName;
		this.memberPhone = memberPhone;
		this.memberAge = memberAge;
	}

//	 3. 회원조회(findById)
//   1. 해당 객체의 회원조회 메서드를 호출하면 해당 회원의 전체 정보를 출력함.
	void findById() {
		
		System.out.print("회원번호 : ");
		System.out.println(this.number);
		System.out.print("아이디 : ");
		System.out.println(this.memberId);
		System.out.print("비밀번호 : ");
		System.out.println(this.memberPw);
		System.out.print("이름 : ");
		System.out.println(this.memberName);
		System.out.print("전화번호 : ");
		System.out.println(this.memberPhone);
		System.out.print("나이 : ");
		System.out.println(this.memberAge);
	}
//	 2. 로그인(memberLogin)
//   1. 로그인 메서드를 호출할 때 가입시 입력한 아이디, 비밀번호를 
//	 매개변수로 전달하고 boolean 리턴을 받아서 로그인 성공, 실패 여부를 출력함. 
	//String  비교는 equals 를 써주는게 좋음
	boolean memberLogin(String memberId, String memberPw) {
		boolean loginResult = false;
		if(this.memberId.equals(memberId) && this.memberPw.equals(memberPw)) {
			loginResult = true;
		}else {
			loginResult = false;
		}
		return loginResult;
	}
	
//  4. 정보수정(update)
//   1. 정보수정은 전화번호만 된다고 가정하고 
//   2. 정보수정 메서드 호출시 변경하고자 하는 전화번호를 매개변수로 넘겨서 해당 필드값을 변경하도록 한다. 
// 	 3. 변경 후 회원조회 메서드를 호출하여 값이 변경됐는지 확인함.	
	void update(String memberPhone) {
		this.memberPhone = memberPhone;
	}
	
	
}
