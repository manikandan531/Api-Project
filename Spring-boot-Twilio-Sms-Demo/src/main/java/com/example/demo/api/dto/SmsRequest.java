package com.example.demo.api.dto;

import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SmsRequest 
{
	
	@NotBlank
	private final String phoneNumber;
	
	@NotBlank
	private final String message;
	
	public SmsRequest(@JsonProperty("phoneNumber") String phoneNumber,
					  @JsonProperty("message")String message)
	{
		this.phoneNumber=phoneNumber;
		this.message=message;
	}
	
	public String getPhoneNumber()
	{
		return phoneNumber;
	}
	
	public String getMessage()
	{
		return message;
	}

	@Override
	public String toString() 
	{
		return "Smsequest{" +
				"phoneNumber=..." + phoneNumber + '\'' +
				",message='" + message + '\'' +
				'}';
	}
	
	
}

