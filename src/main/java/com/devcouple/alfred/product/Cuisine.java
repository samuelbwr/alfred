package com.devcouple.alfred.product;

import com.devcouple.alfred.app.BaseEntity;
import lombok.Data;

import javax.persistence.Entity;

@Entity
@Data
public class Cuisine extends BaseEntity{

    private String name;
}
