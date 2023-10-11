package com.example.demo.Company;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompanyRepository extends MongoRepository<Company,String>{

	List<Object> findCompanyByCompanyName(String companyName);

}
