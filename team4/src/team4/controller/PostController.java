package team4.controller;

import java.util.ArrayList;

import team4.model.Post;

public class PostController {

	ArrayList<Post> postList = new ArrayList<>();
	UserAdminController uac = new UserAdminController();

	public void addPost(Post post) { // 게시글 작성
		postList.add(post);
	}

	public ArrayList<Post> postList() { // 게시글 목록
		return postList;
	}

	public Post viewPost(int index) { // 게시글 1개 보기
		return postList.get(index);
	}

	public void updatePost(int index, Post post) { // 게시글 수정
		postList.set(index, post);
	}

	public boolean deletePost(Post post) { // 게시글 삭제
		return postList.remove(post);
	}

}
