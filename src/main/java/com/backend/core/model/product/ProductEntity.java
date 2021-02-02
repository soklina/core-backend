package com.backend.core.model.product;

import com.backend.core.model.BaseEntity.AuditEntity;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * Created by Sok Lina
 * Date     : 2/2/2021, 7:39 AM
 * Email    : lina.sok@prasac.com.kh
 */

@Entity
@Table(name = "tm_products")
public class ProductEntity extends AuditEntity {

    private String name;
    private String description;
    private BigDecimal price;

    @Id
    @Override
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Column(name = "price")
    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
