package com.api.simpleecommerce.DAO;

import com.api.simpleecommerce.model.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SupplierRepository  extends JpaRepository<Supplier, Integer> {
}
