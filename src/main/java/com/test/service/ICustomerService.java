package com.test.service;

import com.test.domain.Customer;

import java.util.List;

/**
 * @ProjectName: ssmTest1
 * @Package: com.test.service
 * @ClassName: CustomerService
 * @Author: ZhangJunjie
 * @Description:
 * @Date: 2020/4/24 1:30
 * @Version: 1.0
 */
public interface ICustomerService {
    /**
     * description:添加客户
     * create time: 22:09 2020/4/23
     *
     * @param customer 对象
     */
    void saveCustomer(Customer customer);

    /**
     * description: 查询所有数据
     * create time: 19:58 2020/4/25
     *
     * @return 结果集
     */
    List<Customer> findAll();

    /**
     * description: 查询所有数据
     * create time: 19:55 2020/4/25
     *
     * @param id id
     * @return Customer对象
     */
    Customer findById(Integer id);

    /**
     * description: 删除数据
     * create time: 0:42 2020/4/24
     *
     * @param id id信息
     */
    void delete(Integer[] id);
}
