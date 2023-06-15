package team4.model;

import java.util.Objects;

public class Admin {
	
	private String logo;// 사이트 로고?
	private String id;// 관리자 id
	private String password;// 관리자 pw
	private String nickName;// 관리자 닉네임

	public Admin() {
		super();

		
	}
	public Admin(String logo, String id, String password, String nickName) {
		super();
		this.logo = logo;
		this.id = id;
		this.password = password;
		this.nickName = nickName;
	}
	public String getLogo() {
		return logo;
	}
	public void setLogo(String logo) {
		this.logo = logo;
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
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	@Override
	public String toString() {
		return "Admin [logo=" + logo + ", id=" + id + ", password=" + password + ", nickName=" + nickName + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(id, logo, nickName, password);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Admin other = (Admin) obj;
		return Objects.equals(id, other.id) && Objects.equals(logo, other.logo)
				&& Objects.equals(nickName, other.nickName) && Objects.equals(password, other.password);
	}
	
}
