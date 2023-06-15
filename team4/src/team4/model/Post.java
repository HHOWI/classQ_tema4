package team4.model;

import java.util.Date;

public class Post {
	
	private String posttitle;      // 게시글 제목
	private String postThema;      // 게시글 말머리
	private String writepost;      // 글쓰기
	private String postWriter;     // 글쓴이
	private Date uploadDate;        // 업로드 날짜
	private int postNum;           // 게시글 번호
	private int recommends;         // 추천수
	private int views;              // 조회수
	private int comments;           // 댓글수
	private String serch;           // 검색란
	private String serchSelect;     // 검색 선택란 (말머리, 작성자, 게시글제목 ...)
}
