package team4.controller;

import java.util.HashMap;

import team4.model.Admin;

public class AdminController {

	private HashMap<Admin, Integer> hMap = new HashMap<>();
	Admin admin = null;

	public boolean login(String id, String password) {
		if (admin != null && admin.getId().equals(id) && admin.getPassword().equals(password)) {
			return true;
		}

		return false;
	}

	public void setNick(String nickName) {
		admin.setNickname(nickName);

	}

	public boolean removeUser(Admin a) {
		if (hMap.containsKey(a)) {
			hMap.remove(a);
			return true;
		}
		return false;
	}
	public void  answerQA(String userId ,String answer) {
		
	}
	public void manageSite(){
		
	}
	public void manageUser(String  userId){
		
	}
	public void manageBoard(String boardTitle) {
		
	}
}

//	public void addManager(Admin admin) {
//		this.admin=admin;
//		
//	}
