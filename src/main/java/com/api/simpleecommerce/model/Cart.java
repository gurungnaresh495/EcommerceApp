package com.api.simpleecommerce.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name ="cart" )
public class Cart {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name ="cart_id")
    private int cart_id;

    @Column(name ="customer_id")
    private int customer_id;
}
