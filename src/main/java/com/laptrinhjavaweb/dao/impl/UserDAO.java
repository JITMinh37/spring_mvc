package com.laptrinhjavaweb.dao.impl;

import java.util.ArrayList;

import com.laptrinhjavaweb.dao.IUserDAO;
import com.laptrinhjavaweb.mapper.UserMapper;
import com.laptrinhjavaweb.dto.UserDTO;

public class UserDAO extends AbstractDAO<UserDTO> implements IUserDAO{

	@Override
	public UserDTO findUserByUserNameAndPasswordAndStatus(String userName, String passWord, int status) {
		String sql = "Select *\r\n"
				+ "from users as u \r\n"
				+ "inner join roles as r\r\n"
				+ "on u.roleid = r.id\r\n"
				+ "where u.username = ? and u.password = ? and u.status = ?";
		ArrayList<UserDTO> uses = new ArrayList<>();
		uses = query(sql, new UserMapper(), userName, passWord, status);
		return uses.isEmpty() ? null : uses.get(0);
	}

	

}
