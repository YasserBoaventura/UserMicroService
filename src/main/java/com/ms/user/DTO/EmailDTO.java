package com.ms.user.DTO;

import java.io.Serializable;
import java.sql.Savepoint;
import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor 
public class EmailDTO implements Serializable {   
	   private UUID userId;
	   private String emailTo;
	   private String subject;
	   private String text; 
}  
