package com.laptrinhjavaweb.service;

import com.laptrinhjavaweb.dto.UserDTO;

public interface IUserService {
	UserDTO findUserByUserNameAndPasswordAndStatus(String userName, String passWord, int status);
}
