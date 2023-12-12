package com.leonardojcv.hrpayroll.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.leonardojcv.hrpayroll.entities.Payment;
import com.leonardojcv.hrpayroll.entities.Worker;
import com.leonardojcv.hrpayroll.feignClients.WorkerFeignClient;

@Component
public class PaymentService {
	
	@Autowired
	private WorkerFeignClient workerFeignClient;

	public Payment getPayment(Long workerId, int days) {
		Worker worker = workerFeignClient.findById(workerId).getBody();
		return new Payment(worker.getName(), worker.getDailyIncome(), days);
	}
	
}