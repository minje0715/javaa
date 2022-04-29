package day0429;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

public class PostService {
	PostRepository pr = new PostRepository();
	Scanner sc = new Scanner(System.in);
	LocalDateTime dateTime = LocalDateTime.now();
	//�� �ۼ� �޼���
	Long id = 0L;
	
	public void save() {
		System.out.print("�� ���� �Է� -> ");
		String postTitle = sc.next();
		System.out.print("�� �ۼ��� -> ");
		String postWriter = sc.next();
		System.out.print("��й�ȣ�� �Է��ϼ��� -> ");
		String postPass = sc.next();
		System.out.print("���� �ۼ��ϼ��� -> ");
		String postContents = sc.next();
		int postHits = 0;
		System.out.println("�Ѥѱ� �ۼ��ð��Ѥ�");
		String postDate = dateTime.format(DateTimeFormatter.ofPattern("yyyy��MM��dd�� HH:mm:ss"));
		System.out.println(postDate);
		PostDTO post = new PostDTO(++id, postTitle, postWriter, postPass, postContents, postHits, postDate);
		pr.save(post);
		System.out.println("<< �ڡڡڱ� �ۼ��� �Ϸ�Ǿ����ϴ١ڡڡ� >>");
	}
	// �� ���
	public void findAll() {
		List<PostDTO> postList = pr.findAll();
		for(PostDTO post : postList) {
			System.out.println(post);
		}
		
	}
	// �� ��ȸ �޼���
	public void findPost() {
		System.out.print("�� ��ȣ�� �Է��ϼ��� -> ");
		Long id = sc.nextLong();
		boolean result = pr.findpost(id);
		if(!result) {
			System.out.println("�ش��ϴ� ���� �����ϴ٤̤�");
		}
	}
	public void update() {
		System.out.print("�� ��ȣ�� �Է��ϼ��� -> ");
		Long id = sc.nextLong();
		System.out.print("��й�ȣ�� �Է��ϼ��� -> ");
		String postPass = sc.next();
		boolean loginResult = pr.logincheck(id, postPass);
		if(loginResult) {
			System.out.print("������ ������ �Է��ϼ��� -> ");
			String updateTitle = sc.next();
			System.out.print("������ ������ �Է��ϼ��� -> ");
			String updateContents = sc.next();
			pr.update(id, updateTitle, updateContents);
			
		}else {
			System.out.println("�۹�ȣ�� ��й�ȣ�� Ȯ���ϼ��� !!");
		}
	}
	
	public void findWriter() {
		System.out.print("�ۼ��ڸ� �Է��ϼ��� -> ");
		String postwriter = sc.next();
		pr.findwriter(postwriter);
	}
	public void delete() {
		System.out.println("�� ��ȣ�� �Է��ϼ��� -> ");
		Long id = sc.nextLong();
		pr.remove(id);
		List<PostDTO> postList = pr.findAll();
		for(PostDTO post : postList) {
			System.out.println(post);
		}
		
	}


}
