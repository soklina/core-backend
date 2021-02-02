package com.backend.core.model.BaseEntity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by Sok Lina
 * Date     : 2/2/2021, 7:50 AM
 * Email    : lina.sok@prasac.com.kh
 */
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public abstract class AuditEntity implements Serializable {

    private static final long serialVersionUID = -1093165665150323494L;

    protected Long id;
    protected Date createdDate;
    protected Date updatedDate;
    protected String userUpdated;
    protected String userCreated;

    @Transient
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @CreatedDate
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "created_date", updatable = false)
    @JsonIgnore
    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    @LastModifiedDate
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "updated_date")
    @JsonIgnore
    public Date getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(Date updatedDate) {
        this.updatedDate = updatedDate;
    }

    @LastModifiedBy
    @Column(name = "user_updated")
    @JsonIgnore
    public String getUserUpdated() {
        return userUpdated;
    }

    public void setUserUpdated(String userUpdated) {
        this.userUpdated = userUpdated;
    }

    @CreatedBy
    @Column(name = "user_created", updatable = false)
    @JsonIgnore
    public String getUserCreated() {
        return userCreated;
    }

    public void setUserCreated(String userCreated) {
        this.userCreated = userCreated;
    }

}

