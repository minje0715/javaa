package day0429;

import java.util.ArrayList;
import java.util.List;

public class PostRepository {
	static List<PostDTO> postList = new ArrayList<>();

	// ���ۼ� �޼���
	public boolean save(PostDTO post) {
		return postList.add(post);
	}

	// �۸�� �޼���
	public List<PostDTO> findAll() {

		return postList;
	}

	// �� ��ȸ �޼���
	public boolean findpost(Long id) {
		boolean result = false;
		for (int i = 0; i < postList.size(); i++) {
			if (id.equals(postList.get(i).getId())) {
				System.out.println(postList.get(i));
				postList.get(i).setPostHits(postList.get(i).getPostHits()+1); 
				result = true;
			}
		}
		return result;
	}
	

	public boolean logincheck(Long id, String postPass) {
		boolean loginResult = false;
		for (int i = 0; i < postList.size(); i++) {
			if (id.equals(postList.get(i).getId()) && postPass.equals(postList.get(i).getPostPass())) {
				return loginResult = true;
			}
		}
		return loginResult;
	}

	public void findwriter(String postWriter) {
		for (int i = 0; i < postList.size(); i++) {
			if (postWriter.equals(postList.get(i).getPostWriter())) {
				System.out.println(postList.get(i));
			} else {
				System.out.println("�ش��ϴ� ���� �����ϴ٤̤�");
			}
		}
	}

	public void remove(Long id) {
		for (int i = 0; i < postList.size(); i++) {
			if (id.equals(postList.get(i).getId())) {
				postList.remove(i);
			} else {
				System.out.println("�ش��ϴ� ���� �����ϴ٤̤�");
			}
		}
	}

	public void update(Long id, String updateTitle, String updateContents) {
		for(int i=0; i<postList.size();i++) {
			if(id.equals(postList.get(i).getId())) {
				postList.get(i).setPostTitle(updateTitle);
				postList.get(i).setPostContents(updateContents);
				System.out.println(postList.get(i));
			}
		}
		
	}

}
