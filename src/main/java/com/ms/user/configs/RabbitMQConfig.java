package com.ms.user.configs;

import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.support.converter.DefaultJackson2JavaTypeMapper;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.ObjectMapper;




@Configuration
public class RabbitMQConfig {

	
	  @Bean
	  public Jackson2JsonMessageConverter messageConverter() {
			 ObjectMapper mapper = new ObjectMapper();
		  return new  Jackson2JsonMessageConverter(mapper); 
		 
	    } 
	     
	 
} 
