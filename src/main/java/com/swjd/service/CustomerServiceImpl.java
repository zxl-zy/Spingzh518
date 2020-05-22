package com.swjd.service;

import com.swjd.bean.Customer;
import com.swjd.mapper.CustomerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService{
    @Autowired
    CustomerMapper customerMapper;

    @Override
    public List<Customer> getAll() {
        return customerMapper.getAll();
    }
}
