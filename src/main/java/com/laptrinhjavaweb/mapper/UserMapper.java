package com.laptrinhjavaweb.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.laptrinhjavaweb.dto.RoleDTO;
import com.laptrinhjavaweb.dto.UserDTO;

public class UserMapper implements RowMapper<UserDTO>{

	@Override
	public UserDTO mapRow(ResultSet rs) {
		UserDTO user = new UserDTO();
		try {
			user.setId(rs.getLong("id"));
			user.setUserName(rs.getString("username"));
			user.setPassWord(rs.getString("password"));
			user.setFullName(rs.getString("fullname"));
			user.setStatus(rs.getInt("status"));
			RoleDTO role = new RoleDTO();
			role.setName(rs.getString("name"));
			role.setCode(rs.getString("code"));
			user.setRole(role);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			return null;
		}
		return user;
	}
	
}
