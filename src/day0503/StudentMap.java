package day0503;

import java.util.*;

import day0428.MemberDTO;

public class StudentMap {

	static Map<Long, StudentDTO> studentMap = new HashMap<>();

	boolean idcheck(String memberId) {
		boolean idcheck = false;
		for (Long L : studentMap.keySet()) {
			if (memberId.equals(studentMap.get(L).getMemberId())) {
				idcheck = true;
			}
		}
		return idcheck;

	}

	public void save(Long id, StudentDTO member) {
		studentMap.put(id, member);
	}

	public boolean idPw(String memberId, String memberPassword) {
		boolean check = false;
		for (Long L : studentMap.keySet()) {
			if (memberId.equals(studentMap.get(L).getMemberId())
					&& memberPassword.equals(studentMap.get(L).getMemberPassword())) {
				check = true;
			}
		}
		return check;
	}

	public Map<Long, StudentDTO> findAll() {

		return studentMap;
	}

	public void findById(Long id) {
		for (Long l : studentMap.keySet()) {
			if (id.equals(studentMap.get(l).getId())) {
				System.out.println(studentMap.get(l));
			} else {
				System.out.println("조회정보 없습니다");
			}
		}

	}

	public boolean updatecheck(String memberId, String memberPassword) {
		boolean logincheck = false;
		for (Long l : studentMap.keySet()) {
			if (memberId.equals(studentMap.get(l).getMemberId())
					&& memberPassword.equals(studentMap.get(l).getMemberPassword())) {
				return logincheck = true;
			}
		}
		return false;
	}

	public void change(String memberId, String memberMobile) {
		for (Long l : studentMap.keySet()) {
			if (memberId.equals(studentMap.get(l).getMemberId())) {
				studentMap.get(l).setMemberMobile(memberMobile);
			}
		}
	}

	public void remove(Long id) {
		for (Long l : studentMap.keySet()) {
			if (id.equals(studentMap.get(l).getId())) {
				studentMap.remove(l);

			} else {
				System.out.print("중복된 값이 없습니다.");
			}
		}

	}

}
