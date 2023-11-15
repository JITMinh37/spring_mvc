package com.laptrinhjavaweb.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.laptrinhjavaweb.dto.NewsDTO;

public class NewMapper implements RowMapper<NewsDTO>{

	@Override
	public NewsDTO mapRow(ResultSet rs) {
		NewsDTO news = new NewsDTO();
		try {
			news.setId(rs.getLong("id"));
			news.setTitle(rs.getString("title"));
			news.setContent(rs.getString("content"));
			news.setCategoryId(rs.getLong("categoryid"));
			news.setThumbnail(rs.getString("thumbnail"));
			news.setShortDescription(rs.getString("shortdescription"));
			news.setCreatedBy(rs.getString("createdby"));
			news.setCreatedDate(rs.getDate("createddate"));
			if(rs.getString("modifiedby") != null) {
				news.setModifiedBy(rs.getString("modifiedby"));
			}
			if(rs.getDate("modifieddate") != null) {
				news.setModifiedDate(rs.getDate("modifieddate"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			return null;
		}
		return news;
	}
	
}
