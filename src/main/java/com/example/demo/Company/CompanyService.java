package com.example.demo.Company;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Devices.DevicesRepository;
import com.example.demo.Product.ProductRepository;

@Service
public class CompanyService {
	
	@Autowired
    CompanyRepository companyRepository;
    @Autowired
    DevicesRepository devicesRepository;
    @Autowired
    ProductRepository productRepository;
    
    public String addCompany(Company company)
    {
        companyRepository.save(company);
        return company.getCompanyName()+" is added successfully";
    }
    public List<Object> getCompanyByCompanyName(String companyName)
    {
    	List<Object> obj=new ArrayList<>();
    	obj.add(companyRepository.findCompanyByCompanyName(companyName));
    	//obj.add(devicesRepository.findDevicesByCompanyName(companyName));
    	//obj.add(productRepository.findByCompanyName(companyName));
        return obj;
    }
    public List<Company> getAll()
    {
    	return companyRepository.findAll();
    }
    public String deleteCompany(String id)
    {
        companyRepository.deleteById(id);
        return id+" deleted successfully";
    }

}
