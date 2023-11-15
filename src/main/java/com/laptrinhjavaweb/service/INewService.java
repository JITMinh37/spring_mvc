package com.laptrinhjavaweb.service;

import java.util.ArrayList;

import com.laptrinhjavaweb.dto.NewsDTO;


public interface INewService {
	ArrayList<NewsDTO> addByCategoryId(long categoryId);
	NewsDTO save(NewsDTO newModel);
	NewsDTO update(NewsDTO updateNew);
	void delete(long [] ids);
	ArrayList<NewsDTO> listNew();
	int getTotalItem();
	NewsDTO findOne(Long id);

}
