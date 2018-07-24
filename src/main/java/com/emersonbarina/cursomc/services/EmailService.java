package com.emersonbarina.cursomc.services;

import org.springframework.mail.SimpleMailMessage;

import com.emersonbarina.cursomc.domain.Pedido;

public interface EmailService {
	
	void sendOrderConfirmationEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);
	
}
