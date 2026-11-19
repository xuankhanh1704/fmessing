package com.example.demo.entity.base;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.LastModifiedBy;

import java.time.LocalDateTime;

@Getter
@Setter
@MappedSuperclass
public abstract class AuditableEntity extends BaseEntity {

    @CreatedBy
    @Column(updatable = false)
    private Long createdBy;

    @LastModifiedBy
    private Long updatedBy;

    private LocalDateTime deletedAt;


    private Long deletedBy;
}
