package team4.controller;

import java.util.ArrayList;
import java.util.List;

import team4.model.Comment;

public class CommentController {

	List<Comment> comments = new ArrayList<>();
	UserAdminController uac = new UserAdminController();

	// C : 댓글 작성 --> 로그인된 회원만 가능!
	public void addComment(String id, String password, Comment comment, String writingTime ) {
		
	}

	// R : 댓글 1개 보기
	public Comment viewComment(int index) {
		return comments.get(index);
	}

	// U : 댓글 수정 --> 로그인한 회원과 이 댓글을 작성한 작성자가 일치
	public void updateComment(int index, Comment comment) {
		comments.set(index, comment);
	}

	// D : 댓글 삭제 --> 로그인한 회원과 이 댓글을 작성한 작성자가 일치
	public void deleteComment(int index) {
		comments.remove(index);
	}
	
	public void replyComment(String id, String password, Comment comment) { // 답글
		
	}
	
	public void likeComment(int index) { // 좋아요
		
	}
}
