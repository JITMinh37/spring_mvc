package com.laptrinhjavaweb.dao;

import com.laptrinhjavaweb.dto.UserDTO;

public interface IUserDAO extends GenericDAO<UserDTO>{
	UserDTO findUserByUserNameAndPasswordAndStatus(String userName, String passWord, int status);
}
