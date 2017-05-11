package com.webser.controller;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
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
	@RequestMapping(value="/user/{id}",method=RequestMethod.GET,produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<UserVO> getUserbyID(@PathVariable("id")String ida){
		 int id=Integer.parseInt(ida);
		 List<UserVO>  list=userService.getAllUser();
		 Iterator it=list.iterator();
		 UserVO user = null;
		 int count=0;
		 while(it.hasNext()){
			 user=(UserVO) it.next();
			 if(user.getUserId()==id){
				count=1;
				 break;
			 }
				 
		 }
		 if(count==1){
		    return new ResponseEntity<UserVO>(user, HttpStatus.OK);
		 }
		 else{
			 UserVO user1=null;
			 return new ResponseEntity<UserVO>(user1, HttpStatus.NOT_FOUND);
		 }
	}
	@RequestMapping(value="/addUser",method=RequestMethod.POST)
	public ResponseEntity<Integer> addUser(@RequestBody UserVO user){
		System.out.println(user.getAge());
		Integer id=userService.addnewUser(user);
		return new ResponseEntity<Integer>(id,HttpStatus.CREATED);
		
	}
	
	@RequestMapping(value="/deleteUser/{id}",method=RequestMethod.GET)
	public ResponseEntity<Integer> deleteUser(@PathVariable("id")String ida){
		int id=Integer.parseInt(ida);
		Integer idd=userService.deleteUser(id);
		return new ResponseEntity<Integer>(idd,HttpStatus.ACCEPTED);	
	}

}
