package com.swjd.service;

import com.swjd.bean.Customer;
import com.swjd.mapper.CustomerMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface CustomerService {
   ;
    public abstract List<Customer> getAll();

}
