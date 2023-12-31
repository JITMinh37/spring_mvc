package com.laptrinhjavaweb.dao.impl;

import java.util.ArrayList;

import com.laptrinhjavaweb.dao.INewDAO;
import com.laptrinhjavaweb.mapper.NewMapper;
import com.laptrinhjavaweb.dto.NewsDTO;
import org.springframework.stereotype.Repository;


@Repository
public class NewDAO extends AbstractDAO<NewsDTO> implements INewDAO{
	
	
	@Override
	public ArrayList<NewsDTO> addByCategoryId(long categoryId) {
		String sql = "Select * from news where categoryid = ?";
		return query(sql, new NewMapper(), categoryId);
	}

	@Override
	public Long save(NewsDTO newModel) {
		String sql = "Insert into news (title, content, categoryid, thumbnail, shortdescription, createddate, createdby) values (?, ?, ?, ?, ?, ?, ?)";
		
		return insert(sql, newModel.getTitle(), newModel.getContent(), newModel.getCategoryId(), newModel.getThumbnail(), newModel.getShortDescription(), newModel.getCreatedDate(), newModel.getCreatedBy());	
	}

	@Override
	public NewsDTO findOne(Long id) {
		ArrayList<NewsDTO> listNewsModel = new ArrayList<>();
		String sql = "Select * from news where id = ?";
		listNewsModel = query(sql, new NewMapper(), id);
		return listNewsModel.isEmpty() ? null : listNewsModel.get(0);
	}

	@Override
	public void update(NewsDTO updateNew) {
		String sql = "Update news set title = ?, thumbnail = ?, shortdescription = ?, content = ?, categoryid = ?,"
				+ " createddate = ?, createdby = ?, modifieddate = ?, modifiedby = ? where id = ?";
		update(sql, updateNew.getTitle(), updateNew.getThumbnail(), updateNew.getShortDescription(), updateNew.getContent(),
				updateNew.getCategoryId(), updateNew.getCreatedDate(), updateNew.getCreatedBy(),
				updateNew.getModifiedDate(), updateNew.getModifiedBy(), updateNew.getId());
	}

	@Override
	public void delete(long id) {
		// TODO Auto-generated method stub
		String sql = "Delete from news where id = ?";
		update(sql, id);
	}

	@Override
	public ArrayList<NewsDTO> listNews() {
		StringBuilder strbuild = new StringBuilder();
		strbuild.append("Select * from news");

		return query(strbuild.toString(), new NewMapper());
	}
	

	@Override
	public int getTotalItem() {
		String sql = "Select count(*) from news";
		return count(sql);
	}
}
