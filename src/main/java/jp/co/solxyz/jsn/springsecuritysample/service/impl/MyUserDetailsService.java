/* Copyright 2021 SOLXYZ Co., Ltd. All Rights Reserved. */
package jp.co.solxyz.jsn.springsecuritysample.service.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import jp.co.solxyz.jsn.springsecuritysample.dto.UserMstDto;
import jp.co.solxyz.jsn.springsecuritysample.repository.UserMstRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MyUserDetailsService implements UserDetailsService {

  @Autowired private UserMstRepository userMstRepository;

  @Override
  public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

    if (username == null || "".equals(username)) {
      System.out.println("username is empty");
      throw new UsernameNotFoundException("username is empty");
    }

    UserMstDto user = userMstRepository.findByUsername(username);

    if (user == null) {
      System.out.println("user was not found");
      throw new UsernameNotFoundException("User:" + username + " was not found in the database");
    }

    List<GrantedAuthority> grantList = new ArrayList<GrantedAuthority>();
    for (String role : user.getRole().split(",")) {
      GrantedAuthority authority = new SimpleGrantedAuthority(role);
      grantList.add(authority);
    }

    UserDetails userDetails =
        (UserDetails) new User(user.getUsername(), user.getPassword(), grantList);

    return userDetails;
  }
}
