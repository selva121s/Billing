package com.sel.macro.configuration;

import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;

@Configuration
public class AppCofig {
	
	@Bean
	@Primary
	public ObjectMapper objectMapper() {
		ObjectMapper objectMapper=new ObjectMapper();
		DateTimeFormatter dateTimeFormatter=DateTimeFormatter.ofPattern("yyyy-mm-dd hh:mm:ss");
		SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
		LocalDateTimeSerializer localDateTimeSerializer=new LocalDateTimeSerializer(dateTimeFormatter);
		JavaTimeModule javaTimeModule=new JavaTimeModule();
		javaTimeModule.addSerializer(localDateTimeSerializer);
		objectMapper.setSerializationInclusion(Include.NON_NULL);
		objectMapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
		objectMapper.setDateFormat(simpleDateFormat);
		objectMapper.registerModule(javaTimeModule);
		return objectMapper;
	}

}
