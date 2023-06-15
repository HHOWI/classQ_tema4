package team4.impl;

import team4.model.Comment;

public interface CommentImpl {

	public void addComment(String id, String password, Comment comment);

	public Comment viewComment(int index);

	public void updateComment(int index, Comment comment);

	public void deleteComment(int index);
	
    //
	
	public void likeComment(int index, String like);
	
	public void replyComment(String id, String password, Comment comment);
	
}
