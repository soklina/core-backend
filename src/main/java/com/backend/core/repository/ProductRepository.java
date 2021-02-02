package com.backend.core.repository;

import com.backend.core.model.product.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Sok Lina
 * Date     : 2/2/2021, 7:54 AM
 * Email    : lina.sok@prasac.com.kh
 */
@Repository
public interface ProductRepository extends JpaRepository<ProductEntity, Long> {

}
