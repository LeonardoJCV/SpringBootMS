package com.leonardojcv.hrpayroll.services;

import org.springframework.stereotype.Component;

import com.leonardojcv.hrpayroll.entities.Payment;

@Component
public class PaymentService {

	public Payment getPayment(Long workerId, int days) {
		return new Payment("Leonardo", 200.0, days);
	}
	
}
