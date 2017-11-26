package com.devcouple.alfred.product.variation;

import com.devcouple.alfred.foodcharacteristic.Characteristic;
import com.devcouple.alfred.product.Product;

import javax.persistence.ManyToOne;
import java.util.List;

public class ProductVariation {

    @ManyToOne
    private Product product;

    private String name;

    private List<String> ingredients;

    private Double price;

    private List<Characteristic> characteristics;

}
