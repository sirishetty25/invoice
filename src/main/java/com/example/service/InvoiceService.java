package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Invoice;
import com.example.repository.InvoiceRepository;

@Service

public class InvoiceService {
	@Autowired
	InvoiceRepository invoiceRepo;
	public Invoice createInvoice(Invoice invoice) {
		return invoiceRepo.save(invoice);
	}
    
	public Invoice getInvoiceById(String eid) {
		return invoiceRepo.findById(eid).get();
	}
}
