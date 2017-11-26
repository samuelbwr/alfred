package com.devcouple.alfred.foodcharacteristic;

import lombok.Data;

import javax.persistence.Entity;

@Data
@Entity
public class Characteristic {
    private String name;
    private Axis min;
    private Axis max;

    @Data
    class Axis{
        private String name;
        private String value;
    }
}
