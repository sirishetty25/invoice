package com.example.entity;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

//Annotations
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

@ToString
@Document(collection="invoice")
public class Invoice {
	@Id
	private String eid;
	private String InvoiceId;
	private  List<InvoiceItems> items;
	private Double quantity;
    private Double price;	
}
