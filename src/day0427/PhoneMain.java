package day0427;

public class PhoneMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ���ο� �� ���. -> List�� ����
		PhoneDTO phone1 = new PhoneDTO(1L, "������", "123-123", 1000000);

		// Service Ŭ������ phone1 ��ü�� �ѱ�
		// Service Ŭ������ ��ü�� �ѱ�� ���� ��ü�� �����
		PhoneService phoneService = new PhoneService();
		// Service Ŭ������ ������ �ִ� save �޼��� ȣ��
		phoneService.save(phone1);

		// list�� ��� ��ü ������ ��ȸ

		phoneService.findAll();

		PhoneDTO phone2 = new PhoneDTO(2L, "������", "333-3333", 2000000);
		phoneService.save(phone2);
		phoneService.findAll();
	}

}
