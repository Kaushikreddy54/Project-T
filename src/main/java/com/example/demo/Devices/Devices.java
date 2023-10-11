package com.example.demo.Devices;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection="K-2")
public class Devices {
	
	@Id
    public String id;
	private String companyName;
	private String flowName;

}
