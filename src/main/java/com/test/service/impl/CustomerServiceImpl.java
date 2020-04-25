package com.test.service.impl;

import com.test.dao.ICustomerMapper;
import com.test.domain.Customer;
import com.test.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @ProjectName: ssmTest1
 * @Package: com.test.service.impl
 * @ClassName: CustomerServiceImpl
 * @Author: ZhangJunjie
 * @Description:
 * @Date: 2020/4/24 1:31
 * @Version: 1.0
 */
@Transactional
@Service("customerService")
public class CustomerServiceImpl implements ICustomerService {
    @Autowired
    private ICustomerMapper customerMapper;

    @Override
    public void saveCustomer(Customer customer) {
        //判断是增加还是修改
        if (customer.getId() != null) {
            customerMapper.update(customer);
        } else {
            customerMapper.saveCustomer(customer);
        }
    }

    @Override
    public List<Customer> findAll() {
        return customerMapper.findAll();
    }

    @Override
    public Customer findById(Integer id) {
        return customerMapper.findById(id);
    }

    @Override
    public void delete(Integer[] id) {
        customerMapper.delete(id);
    }
}
