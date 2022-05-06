package day0503;

import java.util.Objects;

public class StudentDTO {

	Long id;
	String memberId;
	String memberPassword;
	String memberName;
	String memberAge;
	String memberMobile;

	StudentDTO() {

	}

	public StudentDTO(Long id, String memberId, String memberPassword, String memberName, String memberAge,
			String memberMobile) {
		super();
		this.id = id;
		this.memberId = memberId;
		this.memberPassword = memberPassword;
		this.memberName = memberName;
		this.memberAge = memberAge;
		this.memberMobile = memberMobile;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getMemberPassword() {
		return memberPassword;
	}

	public void setMemberPassword(String memberPassword) {
		this.memberPassword = memberPassword;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public String getMemberAge() {
		return memberAge;
	}

	public void setMemberAge(String memberAge) {
		this.memberAge = memberAge;
	}

	public String getMemberMobile() {
		return memberMobile;
	}

	public void setMemberMobile(String memberMobile) {
		this.memberMobile = memberMobile;
	}

	@Override
	public String toString() {
		return "StudentDTO [id=" + id + ", memberId=" + memberId + ", memberPassword=" + memberPassword
				+ ", memberName=" + memberName + ", memberAge=" + memberAge + ", memberMobile=" + memberMobile + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, memberAge, memberId, memberMobile, memberName, memberPassword);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StudentDTO other = (StudentDTO) obj;
		return Objects.equals(id, other.id) && Objects.equals(memberAge, other.memberAge)
				&& Objects.equals(memberId, other.memberId) && Objects.equals(memberMobile, other.memberMobile)
				&& Objects.equals(memberName, other.memberName) && Objects.equals(memberPassword, other.memberPassword);
	}

}
