package team4.impl;

import team4.model.Post;

public interface PostImpl {

	public void addPost(String id, String password, Post Post);

	public Post viewPost(int index);

	public void updatePost(int index, Post Post);

	public void deletePost(int index);
	
	
}
