package team4.controller;

import java.util.ArrayList;
import java.util.List;

import team4.model.Admin;
import team4.model.Board;
import team4.model.Post;
import team4.model.User;

public class BoardController {
	
	Board board = new Board();
	Admin admin = new Admin();
	User user = new User();
	Post post = new Post();
	
	ArrayList<Board> boardList = new ArrayList<>();
	
	// CRUD
	
	
	
	public void addBoard(Board board) {                                               // 게시판 추가하기
		
		if(user.getId().equals(admin.getId()) ) {			
			boardList.add(board);	
		}
		
	}
	
	
	public int postPage (int page , Post post){                                                    
		
	
		int posts = post.getPostNum();
		
	   if(posts >= 20) {                                                               // 게시판 페이지수 추가
		page++;                 // if문 이용하여 게시글수 20개 이상일때 페이지수 추가
	}
	
		return page;            // return값 ++된 페이지수
	}
	
	
	
//	private List visitBoardList() {                                                    // 마지막 방문 게시판 목록
//		
//		
//		
//		
//		
//		 int lastBoard = boardList.size();
//		
//		 for(int i = 0; i == lastBoard; i++) {
//			 
//		 }
//		 
//		return boardList;
//		
//	}

	
	
	public ArrayList<Board> boardList(){                                               // 게시판 목록 
		
		return boardList;
	}
	
	
	public void readBoard ( int index) {                                                // 게시글 보기
		
		boardList.get(index);
	}
	

	// 게시판 수정 및 삭제는 admin 계정만 가능하도록 설정하기
	// 맞는지 확인필요
	
	public void updataBoard(int index, Board board) {                                  // 게시판 수정
	
		if(user.getId().equals(admin.getId()) ) {			
			boardList.set(index, board);			
		}
		
	}
	
	
	public boolean deleteBoard(Board board) {                                          // 게시판 삭제
		
		
		if(user.getId().equals(admin.getId()) ) {			
			
			return boardList.remove(board);
		}
		
      return false;

}}
