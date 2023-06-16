package team4.model;

import java.util.Date;
import java.util.List;

public class Comment extends User {

	private String comment;
	private Date writingTime;     // 작성 시간
	private int like = 0;			// 좋아요만 있고 싫어요는 없는게 컨셉
	
	private User user;

	public Comment() {
		super();
	}

	public Comment(String name, String id, String password, int age, String gender, String city, String phone,
			String email, String imgUrl, String statusMessge, String nickname, String selectInterest,
			String viewInterest, String birthday, String mbti, String bloodType, boolean lover, boolean admin,
			List<Category> category, String comment, Date writingTime, int like, User user) {
		super(name, id, password, age, gender, city, phone, email, imgUrl, statusMessge, nickname, selectInterest, viewInterest,
				birthday, mbti, bloodType, lover, admin, category);
		this.comment = comment;
		this.writingTime = writingTime;
		this.like = like;
		this.user = user;
		
		
		
	}

	public Comment(String comment, Date writingTime, int like, User user) {
		super();
		this.comment = comment;
		this.writingTime = writingTime;
		this.like = like;
		this.user = user;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public Date getWritingTime() {
		return writingTime;
	}

	public void setWritingTime(Date writingTime) {
		this.writingTime = writingTime;
	}

	public int getLike() {
		return like;
	}

	public void setLike(int like) {
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
		return "Comment [comment=" + comment + ", writingTime=" + writingTime + ", like=" + like + ", user=" + user
				+ "]";
	}


	
	
}