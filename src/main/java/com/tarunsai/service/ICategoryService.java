package com.tarunsai.service;

import java.util.List;

import com.tarunsai.entities.Category;

public interface ICategoryService {
	public Category addCategory(Category category);
	
	public Category updateCategory(Category category);
	
	public Category removeCategory(Category category);
	
	public Category viewCategory(Category category);
	
	public List<Category> viewAllCategory();
}
