package com.example.demo.Company;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Devices.DevicesService;
import com.example.demo.Product.ProductService;

@RestController
public class CompanyController {
	
	@Autowired
    CompanyService companyService;
	@Autowired
	DevicesService devicesService;
	@Autowired
    ProductService productService;
	

    @PostMapping("cmpy")
    public String addCompany(@Validated @RequestBody Company company)
    {
    	return companyService.addCompany(company);
    }
    
    @GetMapping("/cmpys")
    public List<Company> getAll()
    {
    	return companyService.getAll();
    }

    @DeleteMapping("/cmpy/{id}")
    public String deleteCompany(@PathVariable String id)
    {
    	return companyService.deleteCompany(id);
    }
    
    @GetMapping("/cmy/{companyName}")
    public List<Object> getCompanyByCompanyName (@PathVariable String companyName)
    {
    	List<Object> obj=new ArrayList<>();
    	obj.add(companyService.getCompanyByCompanyName(companyName));
    	obj.add(devicesService.getDevicesByCompanyName(companyName));
    	obj.add(productService.getProductByCompanyName(companyName));
    	return obj;
    }
	

}
