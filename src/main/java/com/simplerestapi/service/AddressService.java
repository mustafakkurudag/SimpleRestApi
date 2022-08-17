package com.simplerestapi.service;

import com.simplerestapi.entity.Address;
import com.simplerestapi.repository.IAddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("as")
public class AddressService {

    @Autowired
    private IAddressRepository addressRepository;

    public Address addAddress(Address address) {
        return addressRepository.saveAndFlush(address);
    }

    public List<Address> getAllAddresses() {
        List<Address> addresses = new ArrayList<>();
        addresses = addressRepository.findAll();

        return addresses;
    }
}
