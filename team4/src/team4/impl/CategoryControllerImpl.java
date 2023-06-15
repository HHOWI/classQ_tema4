package team4.impl;

import java.util.ArrayList;

import team4.model.Category;
import team4.model.Interest;

public interface CategoryControllerImpl {

	public void addCategory(Category category); // 관심사 선택목록 추가하기 , 어드민만 가능

	public void selelctCategory(Category category); // 관심사 선택하기

	public ArrayList<Category> categoryList(); // 관심사 전체목록 보기

	public ArrayList<Interest> interestList(); // 선택한 관심사 목록 보기

	public void updataCategory(int index, Category category); // 관심사의 이름 수정, 어드민만 가능

	public void deleteCategory(Category category); // 관심사 선택목록 삭제, 어드민만 가능

	public void deleteInterest(Interest interest); // 관심사 선택 해제

}
