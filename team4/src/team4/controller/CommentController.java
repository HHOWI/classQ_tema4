package team4.controller;
import java.text.SimpleDateFormat;
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
	User user = new User();
	SimpleDateFormat writingTime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

	
	

	// 댓글 작성
	public void addComment(String id, String password, Comment comment) {

		if(uac.login(id, password)) { 
			
	
			comments.add(comment);

			

		} else {
			System.out.println("댓글 작성은 로그인 후 가능합니다.");

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
		} else {
			System.out.println("작성자가 아닙니다. 수정 불가");
		}

	}

	// 댓글 삭제 (로그인한 회원과 댓글 작성자가 일치)

	public void deleteComment(int index, Comment comment) {


		if(comment.getId().equals(user.getId())) {
			comments.remove(index);
		} else {
			System.out.println("작성자가 아닙니다. 삭제 불가");
		}

	}


	public void replyComment(String id, String password, Comment comment) { // 답글 추가

		if(uac.login(id, password)) {       
			comments.add(comment);
			System.out.println(user.getName() + "님이 답글을 달았습니다.");
		} else {
			System.out.println("답글 작성은 로그인 후 가능합니다");
		}
	}




	public void likeComment(String id, String password, int index, Comment like) { // 좋아요 추가
		if(uac.login(id, password)) {       
			comments.add(like);
			System.out.println(user.getName() + "님이 좋아합니다.");
		} else {
			System.out.println("로그인 해주세요");
		}
	}
	


	public void commentwritingTime(Comment comment, String writingTime) { // 작성 시간


		System.out.println("작성 시간 : " + comment.getWritingTime());

	}

}



