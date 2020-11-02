package com.api.simpleecommerce.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "orderline")
public class Orderline {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int orderline_id;

    @Column(name = "cart_id")
    private int cart_id;

    @Column(name = "product_id")
    private int product_id;

    @Column( name = "quantity")
    private int quantity;
}
