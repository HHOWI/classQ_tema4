package team4.controller;

import java.util.HashMap;

import team4.model.Admin;
import team4.model.User;

public class UserAdminController {

	Admin admin = null;
	private HashMap<String,User> hMap = new HashMap<>();
	public void addManager() {// 관리자 추가

	}
		
	
	public boolean login(String id, String password) {// 관리자로그인
		if(admin != null && admin.getId()
	.equals(id)&&admin.getPassword().equals(password)) {
		return true;	
		}
			return false;
	}
	public void setnickName(String nickName) {// 닉네임설정
		admin.setNickName(nickName);
	}
		
	// 유저 관리
	public void  userViewProfile(){
		
	}
	public void userUpdateProfile() {
		
	}
	public boolean userDeleteProfile(String id) {//  계정삭제
		
		if(hMap.containsKey(id)) {
			hMap.remove(id);
			return true;
		}
		return false;
		
	}
	
	public void blackUser(String blackUser) {// 유저 밴
		
		
	}
	//여기까지 유저관리
	
	public void answerQA() {// QA답변
		
	}
	
	
	
		

		
}
	
