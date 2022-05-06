package day0428;

import java.util.ArrayList;
import java.util.List;

import day0427.HumanDTO;

public class MemberRepository {
	static List<MemberDTO> memberList = new ArrayList<>();
	
	public void save(MemberDTO member) {
		memberList.add(member);
		for (int i = 0; i < memberList.size(); i++) {
			memberList.get(i).setId((long) (1 + i));
		}
	}

	List<MemberDTO> findAll() {

		return memberList;
	}

	boolean m(String memberId, String memberPassword) {
		boolean logincheck = false;
		for (int i = 0; i < memberList.size(); i++) {
			if (memberId.equals(memberList.get(i).getMemberId())
					&& memberPassword.equals(memberList.get(i).getMemberPassword())) {
				return logincheck = true;
			}
		}
		return logincheck;

	}

	void findById(Long id) {
		for (int i = 0; i < memberList.size(); i++) {
			if (id.equals(memberList.get(i).getId())) {
				System.out.println(memberList.get(i));
			} else {
				System.out.println("조회정보 없습니다.");
			}
		}
	}

	void change(String memberId, String memberMobile) {
		for (int i = 0; i < memberList.size(); i++) {
			if (memberId.equals(memberList.get(i).getMemberId())) {
				memberList.get(i).setMemberMobile(memberMobile);
			}
		}

	}

	boolean idcheck(String memberId) {
		boolean idcheck = false;
		for (int i = 0; i < memberList.size(); i++) {
			if (memberId.equals(memberList.get(i).getMemberId())) {
				idcheck = true;
			}
		}
		return idcheck;
	}

	void remove(Long id) {
		for (int i = 0; i < memberList.size(); i++) {
			if (id.equals(memberList.get(i).getId())) {
				memberList.remove(i);

			} else {
				System.out.print("중복된 값이 없습니다.");
			}
		}

	}
	
	

}