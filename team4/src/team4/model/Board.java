package team4.model;

import java.util.Date;
import java.util.List;
import java.util.Objects;

public class Board extends Post {

	private String boardName; // 게시판 이름
	private int postPage; // 게시글 페이지 수
	private List visitBoardList; // 마지막 방문 게시판목록
	private String serch; 		// 검색란
	private String serchSelect; // 검색 선택란 (말머리, 작성자, 게시글제목 ...)
	public Board() {
		super();
		
	}
	public Board(String posttitle, String postThema, String writepost, String postWriter, Date uploadDate, int postNum,
			int recommends, int views, int comments) {
		super(posttitle, postThema, writepost, postWriter, uploadDate, postNum, recommends, views, comments);
	
	}
	public Board(String boardName, int postPage, List visitBoardList, String serch, String serchSelect) {
		super();
		this.boardName = boardName;
		this.postPage = postPage;
		this.visitBoardList = visitBoardList;
		this.serch = serch;
		this.serchSelect = serchSelect;
	}
	public String getBoardName() {
		return boardName;
	}
	public void setBoardName(String boardName) {
		this.boardName = boardName;
	}
	public int getPostPage() {
		return postPage;
	}
	public void setPostPage(int postPage) {
		this.postPage = postPage;
	}
	public List getVisitBoardList() {
		return visitBoardList;
	}
	public void setVisitBoardList(List visitBoardList) {
		this.visitBoardList = visitBoardList;
	}
	public String getSerch() {
		return serch;
	}
	public void setSerch(String serch) {
		this.serch = serch;
	}
	public String getSerchSelect() {
		return serchSelect;
	}
	public void setSerchSelect(String serchSelect) {
		this.serchSelect = serchSelect;
	}
	@Override
	public String toString() {
		return "Board [boardName=" + boardName + ", postPage=" + postPage + ", visitBoardList=" + visitBoardList
				+ ", serch=" + serch + ", serchSelect=" + serchSelect + "]";
	}


}