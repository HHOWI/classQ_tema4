package team4.impl;

import java.util.ArrayList;
import java.util.List;

import team4.model.Board;
import team4.model.Comment;
import team4.model.Post;

public interface BoardControllerImpl {
	
	
	public void addBoard(Board board);                       // 게시판 추가
	
	public int postPage (int page);                          // 게시판 페이시수 추가

	public List visitBoardList();                          // 마지막 방문 게시판 목록 
	      
	
	public ArrayList<Board> boardList();                     // 게시판 목록
	   
	public void readBoard ( int index);                      // 게시글 보기
	
	private int recommends(Post recommends) {    // 게시글 추천수 보기
		
		return 0;	
	}
	
	private int views(Post views) {              // 게시글 조회수 보기                                
		
		return 0;
    }
    
	private int comments(Comment comment) {     // 게시글 댓글수 보기
		 
		return 0;
	}
	
	public void updataBoard(int index, Board board);        // 게시판 수정
	
	public void deleteBoard(Board board);                   // 게시판 삭제
}
