package team4.impl;

import team4.model.User;

public interface UserAdminControllerImpl {

	public boolean login();

	public boolean signUp();

	public User viewProfile();

	public User updateProfile();

	public boolean deleteProfile();
	
	public void addManager();
	
	public int blackUser();  
	
	public void qaAnswer();
}
