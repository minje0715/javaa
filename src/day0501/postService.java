package day0501;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class postService {
	Scanner sc = new Scanner(System.in);
	static Long id = 0L;
	postRepository pr = new postRepository();

	public void save() {
		System.out.print("����: ");
		String postTitle = sc.next();
		System.out.print("�ۼ���: ");
		String postWriter = sc.next();
		System.out.print("��й�ȣ: ");
		String postPass = sc.next();
		System.out.print("����: ");
		String postContents = sc.next();

		LocalDateTime dateTime = LocalDateTime.now();
		String postDate = dateTime.format(DateTimeFormatter.ofPattern("yyyy��MM��dd�� HH:mm:ss"));

		postDTO newPost = new postDTO(++id, postTitle, postWriter, postPass, postContents, 0, postDate);
		boolean saveResult = pr.save(newPost);
		if (saveResult) {
			System.out.println("�۵�� �Ϸ�");
		} else {
			System.out.println("�۵�� ����");
		}
	}

	public void findAll() {
		List<postDTO> postList = pr.findAll();
		for (postDTO p : postList) {
			System.out.println(p);
		}
	}

	public void findById() {
		System.out.print("�� ��ȣ: ");
		Long id = sc.nextLong();
		// ��ȸ��ó��
		pr.updateHits(id); // �ϳ��� �޼���� �ϳ��� ó���� �� �ֵ���! �ߺ��ǰ� ��������;
		postDTO post = pr.findById(id);
		System.out.println(post);
	}

	public void update() {
		System.out.println("�۹�ȣ: ");
		Long id = sc.nextLong();
		System.out.println("��й�ȣ: ");
		String postPass = sc.nextLine();
		// 1.�۹�ȣ, ��й�ȣ �´��� üũ
		Long checkId = pr.postCheck(id, postPass);
		// 2.����ó��
		if(checkId != null) {
			System.out.print("����: ");
			String postTitle = sc.next();
			System.out.print("����: ");
			String postContents = sc.next();
			postDTO updatePost = pr.update(checkId, postTitle,postContents);
			System.out.println(updatePost);
		}else {
			System.out.println("��ġ�ϴ� ������ �����ϴ�.");
		}
	}

	public void search() {
		System.out.print("�˻���(�ۼ���): ");
		String keyword = sc.next();
		List<postDTO> searchList = pr.search(keyword); //�˻��� �ϸ� ����Ʈ�� �޴´�!
		if(searchList.size() > 0) {
			for(postDTO p: searchList) {
				System.out.println(p);
			}
		}else {
			System.out.println("�˻������ �����ϴ�.");
		}
	}

	public void delete() {
		/*
		 * 1. �۹�ȣ, ��й�ȣ �Է� �޾Ƽ� ����
		 * 2. ���� ������ ����ó��
		 * 3. ��� ��� �޼��� ȣ��
		 */
		System.out.println("�۹�ȣ: ");
		Long id = sc.nextLong();
		System.out.println("��й�ȣ: ");
		String postPass = sc.nextLine();
		Long checkId = pr.postCheck(id, postPass);
		if(checkId != null) {
			pr.delete(checkId);
			findAll();
		}else {
			System.out.println("��й�ȣ�� Ʋ���ϴ�!");
		}
	}

}











