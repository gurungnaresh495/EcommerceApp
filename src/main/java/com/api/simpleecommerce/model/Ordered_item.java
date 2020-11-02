package com.api.simpleecommerce.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "ordered_item")
public class Ordered_item {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int ordered_item_id;

    @Column (name ="product_id")
    private int product_id;

    @Column (name = "customer_id")
    private int customer_id;

    @Column( name ="quantity")
    private int quantity;
}
