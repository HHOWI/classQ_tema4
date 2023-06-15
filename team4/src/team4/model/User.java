package team4.model;

import java.util.List;
import java.util.Objects;

public class User {

	
	private String name; 			// 이름
	private String id;				// 아이디
	private String password;		// 비밀번호
	private int age; 				// 나이
	private char gender; 			// 성별
	private String city; 			// 지역
	private String phone;			// 핸드폰번호
	private String email;			// 이메일
	private String imgUrl;			// 프로필 사진
	private String statusMessge;	// 상태메시지
	private String nickname; 		// 닉네임
	private String selectInterest; 	// 관심분야 선택
	private String viewInterest;  	// 관심분야 조회
	private String birthday;  		// 생일
	private String mbti;			// mbti
	private String bloodType;		// 혈액형
	private boolean lover; 			// 애인여부
	
	private List<Category> category;

	public User() {
		super();
		
	}

	public User(String name, String id, String password, int age, char gender, String city, String phone, String email,
			String imgUrl, String statusMessge, String nickname, String selectInterest, String viewInterest,
			String birthday, String mbti, String bloodType, boolean lover, List<Category> category) {
		super();
		this.name = name;
		this.id = id;
		this.password = password;
		this.age = age;
		this.gender = gender;
		this.city = city;
		this.phone = phone;
		this.email = email;
		this.imgUrl = imgUrl;
		this.statusMessge = statusMessge;
		this.nickname = nickname;
		this.selectInterest = selectInterest;
		this.viewInterest = viewInterest;
		this.birthday = birthday;
		this.mbti = mbti;
		this.bloodType = bloodType;
		this.lover = lover;
		this.category = category;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	public String getStatusMessge() {
		return statusMessge;
	}

	public void setStatusMessge(String statusMessge) {
		this.statusMessge = statusMessge;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getSelectInterest() {
		return selectInterest;
	}

	public void setSelectInterest(String selectInterest) {
		this.selectInterest = selectInterest;
	}

	public String getViewInterest() {
		return viewInterest;
	}

	public void setViewInterest(String viewInterest) {
		this.viewInterest = viewInterest;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getMbti() {
		return mbti;
	}

	public void setMbti(String mbti) {
		this.mbti = mbti;
	}

	public String getBloodType() {
		return bloodType;
	}

	public void setBloodType(String bloodType) {
		this.bloodType = bloodType;
	}

	public boolean isLover() {
		return lover;
	}

	public void setLover(boolean lover) {
		this.lover = lover;
	}

	public List<Category> getCategory() {
		return category;
	}

	public void setCategory(List<Category> category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", id=" + id + ", password=" + password + ", age=" + age + ", gender=" + gender
				+ ", city=" + city + ", phone=" + phone + ", email=" + email + ", imgUrl=" + imgUrl + ", statusMessge="
				+ statusMessge + ", nickname=" + nickname + ", selectInterest=" + selectInterest + ", viewInterest="
				+ viewInterest + ", birthday=" + birthday + ", mbti=" + mbti + ", bloodType=" + bloodType + ", lover="
				+ lover + ", category=" + category + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, birthday, bloodType, category, city, email, gender, id, imgUrl, lover, mbti, name,
				nickname, password, phone, selectInterest, statusMessge, viewInterest);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return age == other.age && Objects.equals(birthday, other.birthday)
				&& Objects.equals(bloodType, other.bloodType) && Objects.equals(category, other.category)
				&& Objects.equals(city, other.city) && Objects.equals(email, other.email) && gender == other.gender
				&& Objects.equals(id, other.id) && Objects.equals(imgUrl, other.imgUrl) && lover == other.lover
				&& Objects.equals(mbti, other.mbti) && Objects.equals(name, other.name)
				&& Objects.equals(nickname, other.nickname) && Objects.equals(password, other.password)
				&& Objects.equals(phone, other.phone) && Objects.equals(selectInterest, other.selectInterest)
				&& Objects.equals(statusMessge, other.statusMessge) && Objects.equals(viewInterest, other.viewInterest);
	}


	
	
	
}
