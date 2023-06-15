package team4.model;

public class Comment {

	private String id;
	private String comment;
	private String writingTime;
	private String like;
	
	private User user;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getWritingTime() {
		return writingTime;
	}

	public void setWritingTime(String writingTime) {
		this.writingTime = writingTime;
	}

	public String getLike() {
		return like;
	}

	public void setLike(String like) {
		this.like = like;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	
	
}
