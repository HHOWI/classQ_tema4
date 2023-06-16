package team4.controller;

import java.util.ArrayList;
import java.util.Scanner;

import team4.model.Category;
import team4.model.Interest;
import team4.model.Post;
import team4.model.User;

public class CategoryController {

	Category category = new Category();
	User user = new User();
	Post post = new Post();
	Scanner sc = new Scanner(System.in);

	ArrayList<Category> categoryList = new ArrayList<>();
	ArrayList<Interest> interestList = new ArrayList<>();

	// CRUD

	public void addCategory(Category category) { // 관심사 선택목록 추가하기 , 어드민만 가능

		if (user.isAdmin()) {
			categoryList.add(category);

		} else {
			System.out.println("Admin 전용입니다.");
		}

	}

	public void selelctCategory(Category category) { // 관심사 선택하기

		if (categoryList.contains(category)) {
			Interest interest = new Interest(category.getCategoryName());
			interestList.add(interest);

		} else {
			System.out.println("이미 등록된 관심사 이거나, 카테고리에 없는 관심사 입니다.");
		}

	}

	public ArrayList<Category> categoryList() { // 카테고리 전체목록 보기

		return categoryList;
	}

	public ArrayList<Interest> interestList() { // 선택한 관심사 목록 보기

		return interestList;
	}

	public void updataCategory(Category category) { // 카테고리 목록 이름 수정, 어드민만 가능

		if (user.isAdmin()) {
			int index = categoryList.indexOf(category);
			if (index != -1) {
				System.out.println("변경할 카테고리 명을 입력해주세요 : ");
				String newCategoryName = sc.nextLine();
				categoryList.get(index).setCategoryName(newCategoryName);
				System.out.println("카테고리 이름이 수정되었습니다.");
			} else {
				System.out.println("해당 카테고리를 찾을 수 없습니다.");
			}
		}
	}

	public void deleteCategory(Category category) { // 관심사 선택목록 삭제, 어드민만 가능

		if (user.isAdmin()) {
			if(categoryList.contains(category)) {
				categoryList.remove(category);
			}
		} else {
			System.out.println("Admin 전용입니다.");
		}
	}

	public void deleteInterest(Interest interest) { // 관심사 선택 해제

		if (interestList.contains(interest)) {
			interestList.remove(interest);
		}
	}

}
