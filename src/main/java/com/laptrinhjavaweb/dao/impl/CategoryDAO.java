package com.laptrinhjavaweb.dao.impl;

import java.util.ArrayList;

import com.laptrinhjavaweb.dao.ICategoryDAO;
import com.laptrinhjavaweb.mapper.CategoryMapper;
import com.laptrinhjavaweb.dto.CategoryDTO;
import org.springframework.stereotype.Repository;

@Repository
public class CategoryDAO extends AbstractDAO<CategoryDTO> implements ICategoryDAO{
	
	@Override
	public ArrayList<CategoryDTO> findListCategory() {
		String sql = "Select * from category";
		return query(sql, new CategoryMapper());
	}

	@Override
	public CategoryDTO findOne(Long id) {
		ArrayList<CategoryDTO> listCategoryDTO = new ArrayList<>();
		String sql = "Select * from category where id = ?";
		listCategoryDTO = query(sql, new CategoryMapper(), id);
		return listCategoryDTO.isEmpty() ? null : listCategoryDTO.get(0);
	}

	@Override
	public CategoryDTO findOneByCategoryCode(String code) {
		ArrayList<CategoryDTO> listCategoryDTO = new ArrayList<>();
		String sql = "Select * from category where code = ?";
		listCategoryDTO = query(sql, new CategoryMapper(), code);
		return listCategoryDTO.isEmpty() ? null : listCategoryDTO.get(0);
	}
}
