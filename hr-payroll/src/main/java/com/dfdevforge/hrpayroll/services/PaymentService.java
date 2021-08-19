package com.dfdevforge.hrpayroll.services;

import org.springframework.stereotype.Service;

import com.dfdevforge.hrpayroll.entities.Payment;

@Service
public class PaymentService {

	public Payment getPayment(long workerId, int days) {
		return new Payment("Bob", 200.0, days);
	}
}