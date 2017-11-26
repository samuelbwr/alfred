package com.devcouple.alfred.store;

import com.devcouple.alfred.app.BaseEntity;
import com.devcouple.alfred.location.Location;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
@Data
public class Store extends BaseEntity {

    private String name;

    @OneToOne
    private Location location;

    private Double ratingSummary;

}
