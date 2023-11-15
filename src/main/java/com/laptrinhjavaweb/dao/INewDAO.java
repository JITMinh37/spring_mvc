package com.laptrinhjavaweb.dao;

import java.util.ArrayList;

import com.laptrinhjavaweb.dto.NewsDTO;

public interface INewDAO extends GenericDAO<NewsDTO>{
	ArrayList<NewsDTO> addByCategoryId(long categoryId);
	Long save(NewsDTO newModel);
	NewsDTO findOne(Long id);
	void update(NewsDTO updateNew);
	void delete(long id);
	ArrayList<NewsDTO> listNews();
	int getTotalItem();
}
