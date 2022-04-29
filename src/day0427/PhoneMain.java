package day0427;

public class PhoneMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 새로운 폰 등록. -> List에 저장
		PhoneDTO phone1 = new PhoneDTO(1L, "아이폰", "123-123", 1000000);

		// Service 클래스에 phone1 객체를 넘김
		// Service 클래스에 객체를 넘기기 위해 객체를 만들고
		PhoneService phoneService = new PhoneService();
		// Service 클래스가 가지고 있는 save 메서드 호출
		phoneService.save(phone1);

		// list에 담긴 전체 데이터 조회

		phoneService.findAll();

		PhoneDTO phone2 = new PhoneDTO(2L, "갤럭시", "333-3333", 2000000);
		phoneService.save(phone2);
		phoneService.findAll();
	}

}
