package com.api.simpleecommerce.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name="product")
public class Product {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="product_id")
    private int product_id;

    @Column(name="name")
    private String name;

    @Column(name="category")
    private String category;

    @Column(name="description")
    private String description;

    @Column(name="quantity")
    private int quantity;

    @Column(name = "price")
    private double price;

    @Column(name="supplier_id")
    private int supplier_id;
}
