package com.test.dao;

import com.test.domain.Customer;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @ProjectName: ssmTest1
 * @Package: com.test.dao
 * @ClassName: ICustomerMapper
 * @Author: ZhangJunjie
 * @Description: Mapper接口
 * @Date: 2020/4/23 22:09
 * @Version: 1.0
 */
@Repository("customerMapper")
public interface ICustomerMapper {
    /**
     * description:添加客户
     * create time: 22:09 2020/4/23
     *
     * @param customer 对象
     */
    void saveCustomer(Customer customer);

    /**
     * description: 查询所有数据
     * create time: 19:55 2020/4/25
     * @return 结果集
     */
    List<Customer> findAll();


    /**
     * description: 查询所有数据
     * create time: 19:55 2020/4/25
     * @param id id
     * @return Customer对象
     */
    Customer findById(Integer id);

    /**
     * description: 更新账户信息
     * create time: 0:42 2020/4/24
     * @param customer customer信息
     */
    void update(Customer customer);

    /**
     * description: 删除数据
     * create time: 0:42 2020/4/24
     * @param id id信息
     */
    void delete(Integer[] id);
}
