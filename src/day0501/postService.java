package day0501;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class postService {
	Scanner sc = new Scanner(System.in);
	static Long id = 0L;
	postRepository pr = new postRepository();

	public void save() {
		System.out.print("제목: ");
		String postTitle = sc.next();
		System.out.print("작성자: ");
		String postWriter = sc.next();
		System.out.print("비밀번호: ");
		String postPass = sc.next();
		System.out.print("내용: ");
		String postContents = sc.next();

		LocalDateTime dateTime = LocalDateTime.now();
		String postDate = dateTime.format(DateTimeFormatter.ofPattern("yyyy년MM월dd일 HH:mm:ss"));

		postDTO newPost = new postDTO(++id, postTitle, postWriter, postPass, postContents, 0, postDate);
		boolean saveResult = pr.save(newPost);
		if (saveResult) {
			System.out.println("글등록 완료");
		} else {
			System.out.println("글등록 실패");
		}
	}

	public void findAll() {
		List<postDTO> postList = pr.findAll();
		for (postDTO p : postList) {
			System.out.println(p);
		}
	}

	public void findById() {
		System.out.print("글 번호: ");
		Long id = sc.nextLong();
		// 조회수처리
		pr.updateHits(id); // 하나의 메서드는 하나만 처리할 수 있도록! 중복되게 하지마셈;
		postDTO post = pr.findById(id);
		System.out.println(post);
	}

	public void update() {
		System.out.println("글번호: ");
		Long id = sc.nextLong();
		System.out.println("비밀번호: ");
		String postPass = sc.nextLine();
		// 1.글번호, 비밀번호 맞는지 체크
		Long checkId = pr.postCheck(id, postPass);
		// 2.수정처리
		if(checkId != null) {
			System.out.print("제목: ");
			String postTitle = sc.next();
			System.out.print("내용: ");
			String postContents = sc.next();
			postDTO updatePost = pr.update(checkId, postTitle,postContents);
			System.out.println(updatePost);
		}else {
			System.out.println("일치하는 정보가 없습니다.");
		}
	}

	public void search() {
		System.out.print("검색어(작성자): ");
		String keyword = sc.next();
		List<postDTO> searchList = pr.search(keyword); //검색을 하면 리스트로 받는다!
		if(searchList.size() > 0) {
			for(postDTO p: searchList) {
				System.out.println(p);
			}
		}else {
			System.out.println("검색결과가 없습니다.");
		}
	}

	public void delete() {
		/*
		 * 1. 글번호, 비밀번호 입력 받아서 검증
		 * 2. 정보 맞으면 삭제처리
		 * 3. 목록 출력 메서드 호출
		 */
		System.out.println("글번호: ");
		Long id = sc.nextLong();
		System.out.println("비밀번호: ");
		String postPass = sc.nextLine();
		Long checkId = pr.postCheck(id, postPass);
		if(checkId != null) {
			pr.delete(checkId);
			findAll();
		}else {
			System.out.println("비밀번호가 틀립니다!");
		}
	}

}











