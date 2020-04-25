package com.test.domain;

/**
 * @ProjectName: ssmTest1
 * @Package: com.test.domain
 * @ClassName: Customer
 * @Author: ZhangJunjie
 * @Description:实体类
 * @Date: 2020/4/23 22:04
 * @Version: 1.0
 */
public class Customer {
    private Integer id;
    private String name;
    private String gender;
    private String telephone;
    private String address;

    public Customer() {
    }

    public Customer(String name, String gender, String telephone, String address) {
        this.name = name;
        this.gender = gender;
        this.telephone = telephone;
        this.address = address;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", telephone='" + telephone + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
