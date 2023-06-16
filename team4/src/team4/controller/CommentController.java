package team4.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import team4.model.Comment;
import team4.model.User;
import java.util.ArrayList;
import java.util.List;

import team4.model.Comment;

public class CommentController {

	List<Comment> comments = new ArrayList<>();
	UserAdminController uac = new UserAdminController();
	User user = new User();
	List<Comment> writingTime = new ArrayList<>();
	SimpleDateFormat writingTimeFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

	
	

	// 댓글 작성
	public void addComment(String id, String password, Comment comment) {

		if (uac.login(id, password)) {
			comments.add(comment);
			String writingTimeStr = writingTimeFormat.format(new Date()); // 현재 시간을 지정한 형식으로 문자열로 변환
			try {
				Date writingTime = writingTimeFormat.parse(writingTimeStr); // 문자열을 Date 객체로 변환
				comment.setWritingTime(writingTime); // 댓글의 작성 시간 설정
			} catch (ParseException e) {
				e.printStackTrace();
			}
			
		if(uac.login(id, password)) { 
			
	
			comments.add(comment);

			

		} else {
			System.out.println("댓글 작성은 로그인 후 가능합니다.");

		}
		}
	}

	// 댓글 보기
	public Comment viewComment(int index) {
		
		Comment comment = comments.get(index);
		String nickname = comment.getUser().getNickname(); // 댓글 작성자의 닉네임 가져오기
		int likeCount = comment.getLike(); // 댓글의 좋아요 수 가져오기
		Date writingTime = comment.getWritingTime();

		System.out.println("작성자 닉네임: " + nickname);
	    System.out.println("좋아요 수: " + likeCount);
	    System.out.println("작성 시간: " + writingTime);
		
	    return comment;
	}

	// 댓글 수정 (로그인한 회원과 댓글 작성자가 일치)

	public void updateComment(int index, Comment comment) {

		if (comment.getId().equals(user.getId())) {
			comments.set(index, comment);
		} else {
			System.out.println("작성자가 아닙니다. 수정 불가");
		}

	}

	// 댓글 삭제 (로그인한 회원과 댓글 작성자가 일치)

	public void deleteComment(int index, Comment comment) {

		if (comment.getId().equals(user.getId())) {
			comments.remove(index);
		} else {
			System.out.println("작성자가 아닙니다. 삭제 불가");
		}

	}

	public void replyComment(String id, String password, Comment comment) { // 답글 추가

		if (uac.login(id, password)) {
			comments.add(comment);
			System.out.println(user.getName() + "님이 답글을 달았습니다.");
		} else {
			System.out.println("답글 작성은 로그인 후 가능합니다");
		}
	}

	public void likeComment(String id, String password, int index) { // 좋아요 추가
		if (uac.login(id, password)) {
			Comment comment = comments.get(index);
			comment.setLike(comment.getLike() + 1);
			System.out.println(user.getName() + "님이 좋아합니다.");
		} else {
			System.out.println("로그인 해주세요");
		}
	}
}
