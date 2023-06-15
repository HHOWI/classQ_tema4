package team4.impl;

import team4.model.User;

public interface UserAdminControllerImpl {

	public void addManager();

	public boolean login();
	
	public boolean nickName();
	
	public boolean signUp();

	public User viewProfile();

	public User updateProfile();

	public boolean deleteProfile();
	
	public int blackUser();  
	
	public void qaAnswer();
}
