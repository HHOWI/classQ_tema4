package team4.controller;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import team4.model.Admin;
import team4.model.Comment;
import team4.model.User;

public class UserAdminController {

	User user = new User();
	Admin admin = null;
	List<Comment> comments = new ArrayList<>();
	private HashMap<String,User> hMap = new HashMap<>();
	


	public void addManager() {// 관리자 추가 아이시발 깜빡했네이거


	}
		
	
	public boolean login(String id, String password) {// 관리자로그인
		if(admin != null && admin.getId()
	.equals(id)&&admin.getPassword().equals(password)) {
		return true;	
		}
			return false;
	}
	public boolean setnickName(String nickName) {// 닉네임설정
		if(hMap.containsKey(nickName)) {
			hMap.put(nickName, null);
		
		return true;
	}
	return false;
}

		
	// 유저 관리
	public Admin  userViewProfile(){
		if(login(admin.getId(),admin.getPassword())) {
			return admin;
		}
		return null;
	}
	public Admin userUpdateProfile() {
		if(login(this.admin.getId(), this.admin.getPassword())) {
			this.admin = admin;
		}
		
		return this.admin;
		
	}
	public boolean userDeleteProfile(String id) {//  계정삭제
		
		if(hMap.containsKey(id)) {
			hMap.remove(id);
			return true;
		}
		return false;
		
	}
	


	
	
	
	

	public<blackUser> void black(/*String blackUser*/) {// 유저 밴
		Scanner sc = new Scanner(System.in);
	
		System.out.print("블랙시킬 기간을 입력하세요 : ");

		
		System.out.print("년 : ");
		int year = Integer.parseInt(sc.nextLine());
		
		System.out.print("월 : ");
		int month = Integer.parseInt(sc.nextLine());
		
		System.out.print("일 : ");
		int day = Integer.parseInt(sc.nextLine());
		
		LocalDate nowDate = LocalDate.now();		
		LocalDate banDate = LocalDate.of(year, month, day);
		long dDay = ChronoUnit.DAYS.between(nowDate, banDate);
		dDay = nowDate.until(banDate,ChronoUnit.DAYS );
		if(dDay==0) {
			System.out.println("오늘 밴이 해제됩니다.");			
		}else if(dDay>0) {
			System.out.println("밴 해제일로부터"+dDay+"남았습니다");
		}else {
			
		}
		
	}
	//여기까지 유저관리
	
	public void answerQA(Comment comment) {// QA답변
		
		
		
		if(user.getId().equals(admin.getId()) ) {
			comments.add(comment);
		}else {
			System.out.println("Admin 전용입니다.");
		}
		
		
		
	}
	
	
}
	
