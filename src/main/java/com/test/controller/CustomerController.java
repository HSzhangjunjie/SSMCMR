package com.test.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.test.domain.Customer;
import com.test.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ProjectName: ssmTest1
 * @Package: com.test.controller
 * @ClassName: CunstomerController
 * @Author: ZhangJunjie
 * @Description:
 * @Date: 2020/4/24 15:58
 * @Version: 1.0
 */
@Controller
@RequestMapping("/customer")
public class CustomerController {
    /**
     * description:设置Map集合存储需要给页面的数据
     * create time: 21:10 2020/4/25
     */
    private Map<String, Object> result = new HashMap<>();

    /**
     * description:注入业务对象
     * create time: 21:10 2020/4/25
     */
    @Autowired
    private ICustomerService service;

    /**
     * 保存数据
     */
    @RequestMapping("/save")
    @ResponseBody
    public Map<String, Object> save(Customer customer) {
        try {
            service.saveCustomer(customer);
            result.put("success", true);
        } catch (Exception e) {
            e.printStackTrace();
            result.put("success", false);
            result.put("msg", e.getCause());
        }
        return result;
    }

    /**
     * 查询所有数据
     * 返回一个JSON数据
     */
    @RequestMapping("/list")
    @ResponseBody
    public List<Customer> list() {
        List<Customer> list = service.findAll();

        return list;
    }

    /**
     * 查询所有数据,分页查询
     * 返回一个JSON数据
     * EasyUI的datagrid组件，需要提供JSON数据：[{id：1，name：xxx}]
     */
    @RequestMapping("/listByPage")
    @ResponseBody
    public Map<String, Object> listByPage(Integer page, Integer rows) {
        //设置分页参数
        PageHelper.startPage(page, rows);
        //查询所有数据
        List<Customer> list = service.findAll();
        //使用pageInfo封装查询结果
        PageInfo<Customer> pageInfo = new PageInfo<>(list);

        //从pageInfo对象取出查询结果
        //总记录数
        long total = pageInfo.getTotal();
        //当前页数据列表
        List<Customer> customerList = pageInfo.getList();

        result.put("total", total);
        result.put("rows", customerList);

        return result;
    }

    /**
     * 根据ID查询数据
     * 返回一个JSON数据
     */
    @RequestMapping("/findById")
    @ResponseBody
    public Customer findById(Integer id) {
        Customer customer = service.findById(id);
        return customer;
    }

    /**
     * 根据ID查询数据
     * 返回一个JSON数据
     */
    @RequestMapping("/delete")
    @ResponseBody
    public Map<String, Object> delete(Integer[] id) {
        try {
            service.delete(id);
            result.put("success", true);
        } catch (Exception e) {
            e.printStackTrace();
            result.put("msg", e.getCause());
            result.put("success", false);
        }
        return result;
    }

}
