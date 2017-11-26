package com.devcouple.alfred.product;

import com.devcouple.alfred.base.BaseEntity;
import lombok.Data;

import javax.persistence.Entity;

@Entity
@Data
public class Addon extends BaseEntity {
    private String name;
    private Double price;
}
