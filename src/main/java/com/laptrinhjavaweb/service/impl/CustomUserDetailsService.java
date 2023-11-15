package com.laptrinhjavaweb.service.impl;

import com.laptrinhjavaweb.constant.SystemConstant;
import com.laptrinhjavaweb.dto.UserCustom;
import com.laptrinhjavaweb.entity.RoleEntity;
import com.laptrinhjavaweb.entity.UserEntity;
import com.laptrinhjavaweb.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserEntity userEntity = userRepository.findOneByUsernameAndStatus(username, SystemConstant.ACTIVE_USER);
        if(userEntity == null){
            throw new UsernameNotFoundException("User not found");
        }
        // Put dữ liệu, thông tin của người dùng khi đăng nhập vào (Mục đích là để lấy thông tin của người dùng khi cần thiết) -> Đối tượng Pricipal lưu giữ thông tin trong Security.
        List<GrantedAuthority> authorities = new ArrayList<>();
        for(RoleEntity role : userEntity.getRoles()){
            authorities.add(new SimpleGrantedAuthority(role.getCode()));
        }
        UserCustom user = new UserCustom(userEntity.getUsername(), userEntity.getPassword(),
                true, true, true,true, authorities);
        user.setFullName(userEntity.getFullname());
        return user;
    }
}
