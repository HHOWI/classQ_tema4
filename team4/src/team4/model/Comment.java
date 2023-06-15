package team4.model;

public class Comment {

	private String id;
	private String comment;
	private String writingTime;
	private String like;			// 좋아요만 있고 싫어요는 없는게 컨셉
	
	private User user;

	public Comment() {}

	public Comment(String id, String comment, String writingTime, String like, User user) {
		super();
		this.id = id;
		this.comment = comment;
		this.writingTime = writingTime;
		this.like = like;
		this.user = user;
	}

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

	@Override
	public String toString() {
		return "Comment [id=" + id + ", comment=" + comment + ", writingTime=" + writingTime + ", like=" + like
				+ ", user=" + user + "]";
	}
	
	
	
}
