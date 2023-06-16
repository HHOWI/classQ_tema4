package team4.impl;

import team4.model.Comment;

public interface CommentImpl {

	public void addComment(String id, String password, Comment comment); // 댓글 작성

	public Comment viewComment(int index); // 댓글 보기

	public void updateComment(int index, Comment comment); // 댓글 수정

	public void deleteComment(int index); // 댓글 삭제
	
    //
	
	public void likeComment(int index, String like); // 좋아요
	
	public void replyComment(String id, String password, Comment comment); // 답글 추가
	
	public void commentwritingTime(Comment comment, String writingTime); // 댓글 작성 시간
}
