package com.ms.user.Entity;

import java.io.Serializable;
import java.util.UUID;

import org.springframework.stereotype.Service;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name= "TB-users")
@RequiredArgsConstructor
public class UserModel  implements Serializable{
	 
   private static final long serialVersionUID = 1L;
	 @Id 
	 @GeneratedValue(strategy = GenerationType.AUTO)
	 private UUID userId;
	 private String email;
     private String nome; 
	
} 
 