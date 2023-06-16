package team4.controller;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import team4.model.Comment;
import team4.model.User;

public class UserAdminController {
	
	User user = new User();
	boolean admin = user.isAdmin();
	List<Comment> comments = new ArrayList<>();
	private HashMap<String,User> hMap = new HashMap<>();
	private ArrayList<User> list = new ArrayList<>();
	
	public void signUp(User user) {
		
		list.add(user);
	}




	public boolean addManager(String id, User a) {
		if(hMap.containsKey(id)) {
			hMap.put(id, a);		
			return true;
		}
		return false;
	}
	public void addManager(User user ) {
		if(user.isAdmin()) {
			user.setId(user.getId());
			user.setPassword(user.getPassword());
			user.setAdmin(true);
		}


	}
		
	
	public void login(User user) {// 관리자로그인
		if(user.isAdmin()) {
			user.getId();
			user.getPassword();
		}
	}
	
	public boolean setnickName(String nickName) {// 닉네임설정
		if(hMap.containsKey(nickName)) {
			hMap.put(nickName, null);
		
		return true;
	}
	return false;
}

		
	// 유저 관리
	public void  userViewProfile(User viewuser){// 유저 계정 보기
		if(user.isAdmin()) {
			System.out.print(Arrays.toString(list));
		}
		
	}
	public void userUpdateProfile(User updateuser) {// 유저 계정 업데이트
		
		
	}
	public boolean userDeleteProfile(String id) {//  계정삭제
		
		if(hMap.containsKey(id)) {
			hMap.remove(id);
			return true;
		}
		return false;
		
	}
			

	public<blackUser> void black(/*String blackUser*/) {// 유저 밴 며칠이나 몇개월로 설정하고 싶은데 못해서 일단 걍때려박았음
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
		
		
		
		if(user.getId().equals(user.getId()) ) {
			comments.add(comment);
		}else {
			System.out.println("Admin 전용입니다.");
		}
		
		
		
	}
	
	
}
	
