package team4.impl;

import team4.model.User;

public interface UserAdminControllerImpl {

	public void addManager(); // 어드민 추가

	public boolean login();	// 로그인
	
	public boolean logout(); // 로그아웃
	
	public boolean signUp(); // 회원가임

	public User viewProfile(); // 회원 정보 보기

	public User updateProfile(); // 회원 정보 수정

	public boolean deleteProfile(); // 계정삭제
	
	public int blackUser(); // 유저 밴
	
	public void note(); // 쪽지 주고받기
	
	public boolean follow();
	
}
