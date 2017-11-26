package com.devcouple.alfred.product.addon;

import com.devcouple.alfred.app.BaseEntity;
import lombok.Data;

import javax.persistence.Entity;

@Entity
@Data
public class Addon extends BaseEntity {
    private String name;
    private String details;
    private Double price;
}
