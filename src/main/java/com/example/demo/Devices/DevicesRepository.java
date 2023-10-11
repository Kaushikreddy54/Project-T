package com.example.demo.Devices;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DevicesRepository extends MongoRepository<Devices,String>{
	
	List<Devices> findDevicesByCompanyName(String companyName);

}
