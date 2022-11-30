package com.example.demo.api.service;

import com.example.demo.api.dto.SmsRequest;

public interface SmsSender 
{
	void sendSms(SmsRequest smsRequest);
}
