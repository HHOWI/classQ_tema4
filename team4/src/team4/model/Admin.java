package team4.model;

public class Admin {

	
//	private String logo;// 사이트 로고?
	private String id;// 관리자 id
	private String password;// 관리자 pw
	private String nickName;// 관리자 닉네임
	//private String addManager;// 새로운 관리자 추가
	private String removeUser;// 블랙
	private String QAanswer;// QA답변
	private String manageSite;// 사이트 전체적인 관리
	private String manageUser;// 유저 관리
	
	private String manageBoard;// 게시판 관리
	public Admin() {;kl
		super();
	}
	public Admin(String id, String password, String nickname, String addManager, String ban, String qAanswer,
			String managesite, String manageuser, String manageboard) {
		super();
		this.id = id;
		this.password = password;
		this.nickName = nickname;
	//	this.addManager = addManager;
		this.removeUser = ban;
		QAanswer = qAanswer;
		this.manageSite = managesite;
		this.manageUser = manageuser;
		this.manageBoard = manageboard;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getNickname() {
		return nickName;
	}
	public void setNickname(String nickname) {
		this.nickName = nickname;
	}
//	public String getAddManager() {
//		return addManager;
//	}
//	public void setAddManager(String addManager) {
//		this.addManager = addManager;
//	}
	public String getBan() {
		return removeUser;
	}
	public void setBan(String ban) {
		this.removeUser = ban;
	}
	public String getQAanswer() {
		return QAanswer;
	}
	public void setQAanswer(String qAanswer) {
		QAanswer = qAanswer;
	}
	public String getManagesite() {
		return manageSite;
	}
	public void setManagesite(String managesite) {
		this.manageSite = managesite;
	}
	public String getManageuser() {
		return manageUser;
	}
	public void setManageuser(String manageuser) {
		this.manageUser = manageuser;
	}
	public String getManageboard() {
		return manageBoard;
	}
	public void setManageboard(String manageboard) {
		this.manageBoard = manageboard;
	}
	@Override
	public String toString() {
		return "Admin [id=" + id + ", password=" + password + ", nickName=" + nickName + ", addManager=" /*+ addManager*/
				+ ", removeUser=" + removeUser + ", QAanswer=" + QAanswer + ", manageSite=" + manageSite + ", manageUser="
				+ manageUser + ", manageBoard=" + manageBoard + "]";
	}

	
}
