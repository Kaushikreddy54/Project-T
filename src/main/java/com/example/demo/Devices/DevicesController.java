package com.example.demo.Devices;


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
public class DevicesController {
	
	@Autowired
    DevicesService devicesService;
	

    @PostMapping("/device")
    public String addDevices(@Validated @RequestBody Devices devices)
    {
    	return devicesService.addDevice(devices);
    }

    @GetMapping("/device/{companyName}")
    public List<Devices> getDevicesByCompanyName(@PathVariable String companyName)
    {
    	return devicesService.getDevicesByCompanyName(companyName);
    }

    @DeleteMapping("/device/{id}")
    public String deleteDeviceByCompany(@PathVariable String id)
    {
    	return devicesService.deleteDevicesByCompany(id);
    }


}
