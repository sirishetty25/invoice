package com.example.entity;

import org.springframework.data.mongodb.core.mapping.Field;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class InvoiceItems {
	@Field(name="Item_1")
	private String item1;
	
	@Field (name="Item_2")
	private String item2;

}
