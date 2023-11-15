package com.laptrinhjavaweb.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.laptrinhjavaweb.dto.CategoryDTO;

public class CategoryMapper implements RowMapper<CategoryDTO>{

	@Override
	public CategoryDTO mapRow(ResultSet rs) {
		CategoryDTO category = new CategoryDTO();
		try {
			category.setId(rs.getLong("id"));
			category.setName(rs.getString("name"));
			category.setCode(rs.getString("code"));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			return null;
		}
		return category;
	}
}
