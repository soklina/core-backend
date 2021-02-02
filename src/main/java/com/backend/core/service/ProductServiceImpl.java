package com.backend.core.service;

import com.backend.core.exception.ResourceNotFoundException;
import com.backend.core.model.product.ProductEntity;
import com.backend.core.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

/**
 * Created by Sok Lina
 * Date     : 2/2/2021, 7:57 AM
 * Email    : lina.sok@prasac.com.kh
 */
@Service
@Transactional
public class ProductServiceImpl implements ProductService{
    @Autowired
    private ProductRepository productRepository;

    @Override
    public ProductEntity createProduct(ProductEntity product) {
        return productRepository.save(product);
    }

    @Override
    public ProductEntity updateProduct(ProductEntity product) {
        Optional< ProductEntity > productDb = this.productRepository.findById(product.getId());

        if (productDb.isPresent()) {
            ProductEntity productUpdate = productDb.get();
            productUpdate.setId(product.getId());
            productUpdate.setName(product.getName());
            productUpdate.setDescription(product.getDescription());
            productRepository.save(productUpdate);
            return productUpdate;
        } else {
            throw new ResourceNotFoundException("Record not found with id : " + product.getId());
        }
    }

    @Override
    public List<ProductEntity> getAllProduct() {
        return this.productRepository.findAll();
    }

    @Override
    public ProductEntity getProductById(long productId) {
        Optional < ProductEntity > productDb = this.productRepository.findById(productId);

        if (productDb.isPresent()) {
            return productDb.get();
        } else {
            throw new ResourceNotFoundException("Record not found with id : " + productId);
        }
    }

    @Override
    public void deleteProduct(long id) {
        Optional < ProductEntity > productDb = this.productRepository.findById(id);

        if (productDb.isPresent()) {
            this.productRepository.delete(productDb.get());
        } else {
            throw new ResourceNotFoundException("Record not found with id : " + id);
        }
    }

}
