package team4.controller;
import java.util.ArrayList;
import java.util.List;
import team4.model.Comment;
import team4.model.User;
import java.util.ArrayList;
import java.util.List;

import team4.model.Comment;

public class CommentController {

	List<Comment> comments = new ArrayList<>();
	UserAdminController uac = new UserAdminController();
	User user = null;

	// 댓글 작성
	public void addComment(String id, String password, Comment comment) {

		if(uac.login(id, password)) {       
			comments.add(comment);
		}
	}




	// 댓글 보기
	public Comment viewComment(int index) {
		return comments.get(index);
	}



	// 댓글 수정 (로그인한 회원과 댓글 작성자가 일치)

	public void updateComment(int index, Comment comment) {

		if(comment.getId().equals(user.getId())) {
			comments.set(index, comment);
		}

	}

	// 댓글 삭제 (로그인한 회원과 댓글 작성자가 일치)

	public void deleteComment(int index, Comment comment) {


		if(comment.getId().equals(user.getId())) {
			comments.remove(index);
		}

	}

	public void replyComment(String id, String password, Comment comment) { // 답글 추가
		comments.add(comment);
	}

	public void likeComment(int index, Comment like) { // 좋아요 추가
		comments.add(like);
	}
}

