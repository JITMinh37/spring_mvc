package com.laptrinhjavaweb.dao;

import java.util.ArrayList;

import com.laptrinhjavaweb.dto.CategoryDTO;

public interface ICategoryDAO extends GenericDAO<CategoryDTO>{
	ArrayList<CategoryDTO> findListCategory();
	CategoryDTO findOne(Long id);
	CategoryDTO findOneByCategoryCode(String code);
}
