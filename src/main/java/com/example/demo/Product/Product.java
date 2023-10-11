package com.example.demo.Product;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection="K-1")
public class Product {
	
	@Id
	public String id;
	private String productName;
	private String companyName;
	private String type;

}
