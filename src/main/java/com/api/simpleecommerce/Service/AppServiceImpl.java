package com.api.simpleecommerce.Service;

import com.api.simpleecommerce.DAO.ProductRepository;
import com.api.simpleecommerce.DAO.SupplierRepository;
import com.api.simpleecommerce.model.Product;
import com.api.simpleecommerce.model.Supplier;
import org.springframework.beans.factory.annotation.Autowired;

public class AppServiceImpl implements AppService{

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private SupplierRepository supplierRepository;

    @Override
    public void addSupplier(Supplier supplier) {
        supplierRepository.save(supplier);
    }

    @Override
    public void addProduct(Product product) {
        productRepository.save((product));
    }
}
