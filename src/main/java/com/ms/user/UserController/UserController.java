package com.ms.user.UserController;

import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ms.user.DTO.UserRecoredDTO;
import com.ms.user.Entity.UserModel;
import com.ms.user.UserService.UserService;

import ch.qos.logback.core.joran.util.beans.BeanUtil;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {  
  
	private  final UserService userService;      
	 
	@PostMapping("/save") 
	public ResponseEntity<UserModel> save(@RequestBody @Valid UserRecoredDTO userRecoredDTO){
    var userModel = new UserModel(); 
	BeanUtils.copyProperties(userRecoredDTO, userModel);  
		return ResponseEntity.status(HttpStatus.OK).body(userService.save(userModel));  
	}  
	 
	    
} 
