package com.ms.user.UserService;

import org.springframework.stereotype.Service;

import com.ms.user.Entity.UserModel;
import com.ms.user.UserRepository.UserRepository;
import com.ms.user.producers.UserProducer;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;

@Service

public class UserService { 
	                 
	
	private final UserRepository userRepository;
   	private final UserProducer userProducer; 
	 
   	public UserService(UserRepository userRepository,UserProducer userProducer) {
   	 this.userProducer=userProducer;
   	 this.userRepository=userRepository;
   	 
   	}
	@Transactional   
	public UserModel save(UserModel userModel) {
	userModel = userRepository.save(userModel);
	userProducer.publishMessageEmail(userModel);
		return	userModel;
 }  
 	 
}
