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


