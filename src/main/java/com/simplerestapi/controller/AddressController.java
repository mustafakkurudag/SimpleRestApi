package com.simplerestapi.controller;

import com.simplerestapi.entity.Address;
import com.simplerestapi.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class AddressController {
    @Autowired
    private AddressService addressService;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public Address addAddress(@RequestBody Address address) {
        return addressService.addAddress(address);
    }

    @RequestMapping(value = "/listAll", method = RequestMethod.GET)
    public List<Address> getAllAddresses(){
        return addressService.getAllAddresses();
    }
}
