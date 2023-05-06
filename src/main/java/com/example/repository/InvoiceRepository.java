package com.example.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.Invoice;

@Repository

public interface InvoiceRepository extends MongoRepository<Invoice,String> {

	
}
