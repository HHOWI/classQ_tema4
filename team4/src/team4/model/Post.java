package team4.model;

import java.util.Date;
import java.util.Objects;

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
	public Post() {
		super();
	
	}
	public Post(String posttitle, String postThema, String writepost, String postWriter, Date uploadDate, int postNum,
			int recommends, int views, int comments, String serch, String serchSelect) {
		super();
		this.posttitle = posttitle;
		this.postThema = postThema;
		this.writepost = writepost;
		this.postWriter = postWriter;
		this.uploadDate = uploadDate;
		this.postNum = postNum;
		this.recommends = recommends;
		this.views = views;
		this.comments = comments;
		this.serch = serch;
		this.serchSelect = serchSelect;
	}
	public String getPosttitle() {
		return posttitle;
	}
	public void setPosttitle(String posttitle) {
		this.posttitle = posttitle;
	}
	public String getPostThema() {
		return postThema;
	}
	public void setPostThema(String postThema) {
		this.postThema = postThema;
	}
	public String getWritepost() {
		return writepost;
	}
	public void setWritepost(String writepost) {
		this.writepost = writepost;
	}
	public String getPostWriter() {
		return postWriter;
	}
	public void setPostWriter(String postWriter) {
		this.postWriter = postWriter;
	}
	public Date getUploadDate() {
		return uploadDate;
	}
	public void setUploadDate(Date uploadDate) {
		this.uploadDate = uploadDate;
	}
	public int getPostNum() {
		return postNum;
	}
	public void setPostNum(int postNum) {
		this.postNum = postNum;
	}
	public int getRecommends() {
		return recommends;
	}
	public void setRecommends(int recommends) {
		this.recommends = recommends;
	}
	public int getViews() {
		return views;
	}
	public void setViews(int views) {
		this.views = views;
	}
	public int getComments() {
		return comments;
	}
	public void setComments(int comments) {
		this.comments = comments;
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
		return "Post [posttitle=" + posttitle + ", postThema=" + postThema + ", writepost=" + writepost
				+ ", postWriter=" + postWriter + ", uploadDate=" + uploadDate + ", postNum=" + postNum + ", recommends="
				+ recommends + ", views=" + views + ", comments=" + comments + ", serch=" + serch + ", serchSelect="
				+ serchSelect + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(comments, postNum, postThema, postWriter, posttitle, recommends, serch, serchSelect,
				uploadDate, views, writepost);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Post other = (Post) obj;
		return comments == other.comments && postNum == other.postNum && Objects.equals(postThema, other.postThema)
				&& Objects.equals(postWriter, other.postWriter) && Objects.equals(posttitle, other.posttitle)
				&& recommends == other.recommends && Objects.equals(serch, other.serch)
				&& Objects.equals(serchSelect, other.serchSelect) && Objects.equals(uploadDate, other.uploadDate)
				&& views == other.views && Objects.equals(writepost, other.writepost);
	}
	
	
}

