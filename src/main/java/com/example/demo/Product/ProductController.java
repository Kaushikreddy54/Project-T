package com.example.demo.Product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
	
	@Autowired
    ProductService productService;

    @PostMapping("/product")
    public String addProduct(@Validated @RequestBody Product product)
    {
    	return productService.addProduct(product);
    }

    @GetMapping("/product/{companyName}")
    public List<Product> getProductByCompanyName(@PathVariable String companyName)
    {
    	return productService.getProductByCompanyName(companyName);
    }

    @DeleteMapping("/product/{id}")
    public String deleteProductById(@PathVariable String id)
    {
    	return productService.deleteProductById(id);
    }


}
