package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Invoice;
import com.example.service.InvoiceService;

@RestController
@RequestMapping("api/invoice")

public class InvoiceController {
@Autowired
InvoiceService invoiceService;

@PostMapping("/create")
public Invoice createInvoice(@RequestBody Invoice invoice) {
	return invoiceService.createInvoice(invoice);
	
}

@GetMapping("/getBYId/{id}")
public Invoice getStudentById(@PathVariable String eid) {
return invoiceService.getInvoiceById(eid);
}
}
