package com.laptrinhjavaweb.service.impl;

import java.sql.Date;
import java.util.ArrayList;



import com.laptrinhjavaweb.dao.ICategoryDAO;
import com.laptrinhjavaweb.dao.INewDAO;
import com.laptrinhjavaweb.dto.CategoryDTO;
import com.laptrinhjavaweb.dto.NewsDTO;
import com.laptrinhjavaweb.service.INewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class NewService implements INewService{
	
	@Autowired
	private INewDAO newDao;
	@Autowired
	private ICategoryDAO categoryDao;

	
	@Override
	public ArrayList<NewsDTO> addByCategoryId(long categoryId) {
		// TODO Auto-generated method stub
		return newDao.addByCategoryId(categoryId);
	}

	@Override
	public NewsDTO save(NewsDTO newModel) {
		newModel.setCreatedDate(new Date(System.currentTimeMillis()));
		CategoryDTO category = categoryDao.findOneByCategoryCode(newModel.getCategoryCode());
		newModel.setCategoryId(category.getId());
		Long id = newDao.save(newModel);
		return newDao.findOne(id);
	}

	@Override
	public NewsDTO update(NewsDTO updateNew) {
		// TODO Auto-generated method stub
		NewsDTO oldNew = newDao.findOne(updateNew.getId());
		CategoryDTO category = categoryDao.findOneByCategoryCode(updateNew.getCategoryCode());
		updateNew.setCategoryId(category.getId());
		updateNew.setCreatedBy(oldNew.getCreatedBy());
		updateNew.setCreatedDate(oldNew.getCreatedDate());
		updateNew.setModifiedDate(new Date(System.currentTimeMillis()));
		newDao.update(updateNew);
		return newDao.findOne(updateNew.getId());
	}

	@Override
	public void delete(long[] ids) {
		// TODO Auto-generated method stub
		for(long id : ids) {
			newDao.delete(id);
		}
	}

	@Override
	public ArrayList<NewsDTO> listNew() {
		return newDao.listNews();
	}

	@Override
	public int getTotalItem() {
		return newDao.getTotalItem();
	}

	@Override
	public NewsDTO findOne(Long id) {
		NewsDTO news = newDao.findOne(id);
		CategoryDTO category = categoryDao.findOne(news.getCategoryId());
		news.setCategoryCode(category.getCode());
		return news;
	}

	
}
