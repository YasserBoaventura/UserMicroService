package com.ms.user.producers;

import org.springframework.amqp.rabbit.core.RabbitMessagingTemplate;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.ms.user.DTO.EmailDTO;
import com.ms.user.Entity.UserModel;

import lombok.RequiredArgsConstructor;

@Component 
@RequiredArgsConstructor 
public class UserProducer {
    @Autowired
	private final RabbitTemplate rabbitTemplate;
	     
    @Value(value = "${broker.queues.email.name}")
	private String routingKey;   
	        
    public void publishMessageEmail(UserModel userModel) { 
		 var emailDTO = new EmailDTO();     
		 emailDTO.setUserId(userModel.getUserId());
		 emailDTO.setEmailTo(userModel.getEmail());
		 emailDTO.setSubject("cadastro realizado com sucesso");
		 emailDTO.setText(userModel.getNome()+", seja bem vindo(a) agradecemos o seu cadastro aproveite os recursos da nossa plataforma!");
          //enviando a menssagem pra o broker 
		 rabbitTemplate.convertAndSend("",routingKey, emailDTO);
		 System.out.println("estou a converter"+userModel.getNome());
	 }   
 
}
