package com.api.simpleecommerce.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name="supplier")
public class Supplier {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name ="supplier_id")
    private int supplier_id;

    @Column(name = "supplier_name")
    private String supplier_name;

    @Column(name = "supplier_location")
    private String supplier_location;
}
