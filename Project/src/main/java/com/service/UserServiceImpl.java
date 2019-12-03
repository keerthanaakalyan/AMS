package com.service;

import org.springframework.stereotype.Service;

import com.model.User;
@Service
public class UserServiceImpl implements UserService{

	@Override
	public User createUser(User user) {
		
		return null;
	}

	@Override
	public User readUserById(long id) {
		User user=null;//if we create here, it is called eager loading
		if(id>0 && id==10){
			user=new User();
			user.setUserId(456);
			user.setUserName("Ten");
		}
      if(id>0 && id==20){
    	  user=new User();
			user.setUserId(456);
			user.setUserName("Twenty");
		}
		return user;
	}

	@Override
	public User readUserByName(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User updateUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User deleteUserById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
