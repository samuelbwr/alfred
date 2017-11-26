package com.devcouple.alfred.location;

import com.devcouple.alfred.app.BaseEntity;
import lombok.Data;

import javax.persistence.Entity;

@Entity
@Data
public class Location extends BaseEntity{
    private Double latitude;
    private Double longitude;
}
