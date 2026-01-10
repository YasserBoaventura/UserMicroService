package com.ms.user.UserService;

import org.springframework.stereotype.Service;

import com.ms.user.Entity.UserModel;
import com.ms.user.UserRepository.UserRepository;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserService {
	                
	private final UserRepository userRepository;
	 
	@Transactional   
	public UserModel save(UserModel userModel) {
		return userRepository.save(userModel); 
	} 
 
}
