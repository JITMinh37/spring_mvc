package com.laptrinhjavaweb.service;

import java.util.ArrayList;

import com.laptrinhjavaweb.dto.CategoryDTO;

public interface ICategoryService {
	ArrayList<CategoryDTO> findListCategory();
}
