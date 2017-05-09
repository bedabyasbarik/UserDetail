package com.webser.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.webser.service.UserService;
import com.webser.vo.UserVO;

@RestController
public class UserDatacontroller {
	@Autowired
	@Qualifier("userService")
	UserService userService;
	@RequestMapping(value="/users",method=RequestMethod.GET,produces=MediaType.APPLICATION_JSON_VALUE)
	public List<UserVO> getUsers(){
		List<UserVO> list=userService.getAllUser();
		return list;
	}
  

}
