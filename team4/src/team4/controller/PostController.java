package team4.controller;

import java.util.ArrayList;

import team4.model.Post;
import team4.model.User;

public class PostController {

	ArrayList<Post> postList = new ArrayList<>();
	UserAdminController uac = new UserAdminController();
	User user = new User();

	public void addPost(Post post) { // 게시글 작성
		postList.add(post);
	}

	public ArrayList<Post> postList() { // 게시글 목록
		return postList;
	}

	public Post viewPost(int index) { // 게시글 1개 보기
		return postList.get(index);
	}

    public void adiminReadPost (int index) {// QnA 게시글 보기
    	
    	if(user.isAdmin()) {
		postList.get(index);
    	}else {
    		System.out.println("관리자만 해당 게시글을 확인할 수 있습니다.");
    	}
		
	}
	
	
	
	public void updatePost(int index, Post post) { // 게시글 수정
		postList.set(index, post);
	}

	public boolean deletePost(Post post) { // 게시글 삭제
		return postList.remove(post);
	}

}
