package org.sid.manal.billingservice.repository;

import org.sid.manal.billingservice.entities.ProductItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductItemRepository extends JpaRepository<ProductItem,Long>
{
}
