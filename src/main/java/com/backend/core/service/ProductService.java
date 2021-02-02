package com.backend.core.service;

import com.backend.core.model.product.ProductEntity;

import java.util.List;

/**
 * Created by Sok Lina
 * Date     : 2/2/2021, 7:56 AM
 * Email    : lina.sok@prasac.com.kh
 */

public interface ProductService {
    ProductEntity createProduct(ProductEntity product);

    ProductEntity updateProduct(ProductEntity product);

    List< ProductEntity > getAllProduct();

    ProductEntity getProductById(long productId);

    void deleteProduct(long id);
}
