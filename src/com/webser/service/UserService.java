package com.webser.service;



import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.webser.vo.UserVO;

@Service
public class UserService {
    @Transactional
	public List<UserVO> getAllUser(){
		List<UserVO> list=new ArrayList<UserVO>();
		list.add(new UserVO(1, "bedabyas", "55598556", 25));
		list.add(new UserVO(2, "manju", "568468668", 28));
		list.add(new UserVO(3, "shr", "568468468", 22));
		list.add(new UserVO(3, "madhu", "25458486", 27));
		
		return list;
		
	}

}
