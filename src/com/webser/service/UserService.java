package com.webser.service;



import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.webser.vo.UserVO;

@Service
public class UserService {
	List<UserVO> list;


	public List<UserVO> getAllUser(){	
    	if(list==null){
    	list=new ArrayList<UserVO>();
    	list.add(new UserVO(1, "bedabyas", "55598556", 25,"pes","bangalore"));
    	list.add(new UserVO(2, "manju", "568468668", 28,"mara","bangalore"));
    	list.add(new UserVO(3, "shr", "568468468", 22,"mara","bangalore"));
    	list.add(new UserVO(4, "madhu", "25458486", 27,"pes","bangalore"));	
    	}
		return list;		
	}
    
    @Transactional
    public int addnewUser(UserVO user){
    	list.add(user);
		return user.getUserId();    	
    }
    @Transactional
    public int deleteUser(int id){
    	 Iterator it=list.iterator();
		 UserVO user = null;
		 int count=0;
		 while(it.hasNext()){
			 user=(UserVO) it.next();
			 if(user.getUserId()==id){
				list.remove(user);
				return id;
			 }
				 
		 }
		return 0;    	
    }

}
