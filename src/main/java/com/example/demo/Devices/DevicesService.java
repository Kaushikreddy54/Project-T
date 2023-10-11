package com.example.demo.Devices;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class DevicesService {
	
	@Autowired
    DevicesRepository devicesRepository;
   
    public String addDevice(Devices devices)
    {
        devicesRepository.save(devices);
        return devices.getCompanyName()+" is added successfully";
    }
    public List<Devices> getDevicesByCompanyName(String companyName)
    {
    	return devicesRepository.findDevicesByCompanyName(companyName);
    }
    public String deleteDevicesByCompany(String id)
    {
        devicesRepository.deleteById(id);
        return id+" deleted successfully";
    }


}
