package com.api.simpleecommerce.Service;

import com.api.simpleecommerce.model.Product;
import com.api.simpleecommerce.model.Supplier;

public interface AppService {

    public void addSupplier(Supplier supplier);
    public void addProduct(Product product);
}
