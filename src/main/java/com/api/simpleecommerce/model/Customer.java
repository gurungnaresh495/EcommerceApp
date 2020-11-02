package com.api.simpleecommerce.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name ="customer")
public class Customer {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "product_id")
    private int customer_id;

    @Column(name = "fname")
    private String fname;

    @Column(name ="lname")
    private String lname;

    @Column(name = "phone")
    private String phone;

    @Column (name = "address")
    private String address;

    @Column (name = "email")
    private String email;
}
