package team4.controller;
import java.util.ArrayList;
import java.util.List;
import team4.model.Comment;

public class CommentController {

	List<Comment> comments = new ArrayList<>();
	UserAdminController uac = new UserAdminController();

	// 댓글 작성
	public void addComment(String id, String password, Comment comment) {

		if(uac.login(id, password)) {          // UserAdminController 로그인
			comments.add(comment);
		}
	}

	// 댓글 보기
	public Comment viewComment(int index) {
		return comments.get(index);
	}


	// 댓글 수정 (로그인한 회원과 댓글 작성자가 일치)
	public void updateComment(int index, Comment comment) {
		
	
		
		comments.set(index, comment);
	}

	// 댓글 삭제 (로그인한 회원과 댓글 작성자가 일치)
    public void deleteComment(int index) {
    	comments.remove(index);
    }
    
   

}