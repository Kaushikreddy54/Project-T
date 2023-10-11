package com.example.demo.Company;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection="K-3")
public class Company {
	
	@Id
	public String id;
	private String companyName;
    private String hisName;
}
