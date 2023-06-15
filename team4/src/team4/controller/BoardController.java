package team4.controller;

import java.util.ArrayList;

import team4.model.Board;

public class BoardController {
	
	ArrayList<Board> boardList = new ArrayList<>();
	
	// CRUD
	
	
	
	public void write(Board board) {                                                   // 게시글 쓰기
		
		boardList.add(board);
	}
	
	public ArrayList<Board> boardList(){                                               // 게시글 목록 
		
		return boardList;
	}
	
	
	public void readBoard ( int index) {                                                // 게시글 보기
		
		boardList.get(index);
	}
	

	
	public void updataBoard(int index, Board board) {                                  // 게시글 수정
		
		boardList.set(index, board);
	}
	
	
	public boolean deleteBoard(Board board) {                                          // 게시글 삭제
		
		
		return boardList.remove(board);
	}
	
	
	
	
	
	

}
