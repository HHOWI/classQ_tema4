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
	private HashMap<String, User> hMap = new HashMap<>();
	private ArrayList<User> list = new ArrayList<>();

	public void signUp(User user) {

		list.add(user);
	}

	public boolean login(String id, String password) {


		for (User user : list) {

			if (user.getId().equals(id) && user.getPassword().equals(password)) {
				return true;
			}
		}
		return false;
	}

	public void logout() {

	}

	public void addManager(String id, String password) {

		user.setId(id);
		user.setPassword(password);
		user.setAdmin(true);

	}


	// 유저 관리
	public List<User> userViewProfile(String userId) {// 유저 계정 정보 보기

		List<User> matchingUsers = new ArrayList<>();

		for (User user : list) {
			if (user.getId().equals(userId)) {
				matchingUsers.add(user);
			}
		}
		return matchingUsers;

	}

	public void userUpdateProfile(User user, String fieldName, String updatedValue) {// 유저 계정 정보 수정

		switch (fieldName) {
		case "name":
			user.setName(updatedValue);
			break;
		case "password":
			user.setPassword(updatedValue);
			break;
		case "age":
			try {
				int age = Integer.parseInt(updatedValue);
				user.setAge(age);
			} catch (NumberFormatException e) {
				System.out.println("유효한 나이 값을 입력하세요.");
			}
			break;
		case "gender":
			user.setGender(updatedValue);
			break;
		case "city":
			user.setName(updatedValue);
			break;
		case "phoen":
			user.setPhone(updatedValue);
			break;
		case "email":
			user.setEmail(updatedValue);
			break;
		case "statusMessge":
			user.setStatusMessge(updatedValue);
			break;
		case "nickname":
			user.setNickname(updatedValue);
			break;
		case "birtday":
			user.setBirthday(updatedValue);
			break;
		case "mbti":
			user.setMbti(updatedValue);
			break;
		case "bloodType":
			user.setBloodType(updatedValue);
			break;
		case "lover":
			user.setLover(false);
			break; // 추후 수정

		}

	}

	public boolean userDeleteProfile(String id) {// 계정삭제

		if (hMap.containsKey(id)) {
			hMap.remove(id);
			return true;
		}
		return false;

	}

	public <blackUser> void black(/* String blackUser */) {// 유저 밴 며칠이나 몇개월로 설정하고 싶은데 못해서 일단 걍때려박았음
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
		dDay = nowDate.until(banDate, ChronoUnit.DAYS);
		if (dDay == 0) {
			System.out.println("오늘 밴이 해제됩니다.");
		} else if (dDay > 0) {
			System.out.println("밴 해제일로부터" + dDay + "남았습니다");
		} else {

		}

	}
	// 여기까지 유저관리


}
