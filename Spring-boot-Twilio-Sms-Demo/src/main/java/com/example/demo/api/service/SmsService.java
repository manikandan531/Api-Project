package com.example.demo.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.demo.api.dto.SmsRequest;
import com.example.demo.api.entity.TwilioSmsSender;


@Service
public class SmsService
{
	
	private final SmsSender smsSender;
	
	@Autowired
	public SmsService(@Qualifier("twilio")TwilioSmsSender  twilioSmsSender)
	{
		this.smsSender = twilioSmsSender;
	}
	
	
	public void sendSms(SmsRequest smsRequest)
	{
		smsSender.sendSms(smsRequest);
	}
	
}
