package team4.controller;

import java.util.ArrayList;

import team4.model.Admin;
import team4.model.Category;
import team4.model.Interest;
import team4.model.Post;
import team4.model.User;

public class CategoryController {

	Category category = new Category();
	Admin admin = new Admin();
	User user = new User();
	Post post = new Post();

	ArrayList<Category> categoryList = new ArrayList<>();
	ArrayList<Interest> interestList = new ArrayList<>();

	// CRUD

	public void addCategory(Category category) { // 관심사 선택목록 추가하기 , 어드민만 가능

		if (user.getId().equals(admin.getId())) {
			categoryList.add(category);

		} else {
			System.out.println("Admin 전용입니다.");
		}

	}
	
	public void selelctCategory(Category category) { // 관심사 선택하기
		
	}


	public ArrayList<Category> categoryList() { // 카테고리 전체목록 보기 

		return categoryList;
	}
	
	public ArrayList<Interest> interestList() { // 선택한 관심사 목록 보기

		return interestList;
	}


	public void updataCategory(int index, Category category) { // 관심사 목록 이름 수정, 어드민만 가능

		if (user.getId().equals(admin.getId())) {
			categoryList.set(index, category);
		} else {
			System.out.println("Admin 전용입니다.");
		}

	}

	public void deleteCategory(Category category) { // 관심사 선택목록 삭제, 어드민만 가능

		if (user.getId().equals(admin.getId())) {

			categoryList.remove(category);
		} else {
			System.out.println("Admin 전용입니다.");
		}

	}
	
	public void deleteInterest(Interest interest) { // 관심사 선택 해제

		

	}


}
