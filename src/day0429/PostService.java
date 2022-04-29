package day0429;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

public class PostService {
	PostRepository pr = new PostRepository();
	Scanner sc = new Scanner(System.in);
	LocalDateTime dateTime = LocalDateTime.now();
	//글 작성 메서드
	Long id = 0L;
	
	public void save() {
		System.out.print("글 제목 입력 -> ");
		String postTitle = sc.next();
		System.out.print("글 작성자 -> ");
		String postWriter = sc.next();
		System.out.print("비밀번호를 입력하세요 -> ");
		String postPass = sc.next();
		System.out.print("글을 작성하세요 -> ");
		String postContents = sc.next();
		int postHits = 0;
		System.out.println("ㅡㅡ글 작성시간ㅡㅡ");
		String postDate = dateTime.format(DateTimeFormatter.ofPattern("yyyy년MM월dd일 HH:mm:ss"));
		System.out.println(postDate);
		PostDTO post = new PostDTO(++id, postTitle, postWriter, postPass, postContents, postHits, postDate);
		pr.save(post);
		System.out.println("<< ★★★글 작성이 완료되었습니다★★★ >>");
	}
	// 글 목록
	public void findAll() {
		List<PostDTO> postList = pr.findAll();
		for(PostDTO post : postList) {
			System.out.println(post);
		}
		
	}
	// 글 조회 메서드
	public void findPost() {
		System.out.print("글 번호를 입력하세요 -> ");
		Long id = sc.nextLong();
		boolean result = pr.findpost(id);
		if(!result) {
			System.out.println("해당하는 글이 없습니다ㅜㅜ");
		}
	}
	public void update() {
		System.out.print("글 번호를 입력하세요 -> ");
		Long id = sc.nextLong();
		System.out.print("비밀번호를 입력하세요 -> ");
		String postPass = sc.next();
		boolean loginResult = pr.logincheck(id, postPass);
		if(loginResult) {
			System.out.print("수정할 제목을 입력하세요 -> ");
			String updateTitle = sc.next();
			System.out.print("수정할 내용을 입력하세요 -> ");
			String updateContents = sc.next();
			pr.update(id, updateTitle, updateContents);
			
		}else {
			System.out.println("글번호와 비밀번호를 확인하세요 !!");
		}
	}
	
	public void findWriter() {
		System.out.print("작성자를 입력하세요 -> ");
		String postwriter = sc.next();
		pr.findwriter(postwriter);
	}
	public void delete() {
		System.out.println("글 번호를 입력하세요 -> ");
		Long id = sc.nextLong();
		pr.remove(id);
		List<PostDTO> postList = pr.findAll();
		for(PostDTO post : postList) {
			System.out.println(post);
		}
		
	}


}
