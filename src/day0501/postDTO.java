package day0501;

import java.time.LocalDateTime;
import java.util.Objects;

public class postDTO {
	private Long id; 
	private String postTitle; 
	private String postWriter; 
	private String postPass;
	private String postContents; 
	private int postHits = 0; //ÃÊ±ê°ªÀ» ÁÖ¸é º°µµ·Î °ªÀ» ¾ÈÁàµµ µÊ; 
	private String postDate; 
	// LocalDate postDate;
	public postDTO() {
		
	}
	
	public postDTO(Long id, String postTitle, String postWriter, String postPass, String postContents, int postHits,
			String postDate) {
		this.id = id;
		this.postTitle = postTitle;
		this.postWriter = postWriter;
		this.postPass = postPass;
		this.postContents = postContents;
		this.postHits = postHits;
		this.postDate = postDate;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPostTitle() {
		return postTitle;
	}

	public void setPostTitle(String postTitle) {
		this.postTitle = postTitle;
	}

	public String getPostWriter() {
		return postWriter;
	}

	public void setPostWriter(String postWriter) {
		this.postWriter = postWriter;
	}

	public String getPostPass() {
		return postPass;
	}

	public void setPostPass(String postPass) {
		this.postPass = postPass;
	}

	public String getPostContents() {
		return postContents;
	}

	public void setPostContents(String postContents) {
		this.postContents = postContents;
	}

	public int getPostHits() {
		return postHits;
	}

	public void setPostHits(int postHits) {
		this.postHits = postHits;
	}

	public String getPostDate() {
		return postDate;
	}

	public void setPostDate(String postDate) {
		this.postDate = postDate;
	}

	@Override
	public String toString() {
		return "postDTO [id=" + id + ", postTitle=" + postTitle + ", postWriter=" + postWriter + ", postPass="
				+ postPass + ", postContents=" + postContents + ", postHits=" + postHits + ", postDate=" + postDate
				+ "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, postContents, postDate, postHits, postPass, postTitle, postWriter);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		postDTO other = (postDTO) obj;
		return Objects.equals(id, other.id) && Objects.equals(postContents, other.postContents)
				&& Objects.equals(postDate, other.postDate) && postHits == other.postHits
				&& Objects.equals(postPass, other.postPass) && Objects.equals(postTitle, other.postTitle)
				&& Objects.equals(postWriter, other.postWriter);
	}
	
	
	
}
