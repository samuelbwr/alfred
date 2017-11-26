package com.devcouple.alfred.product;

import com.devcouple.alfred.app.BaseEntity;
import com.devcouple.alfred.product.addon.AddonGroup;
import com.devcouple.alfred.store.Store;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
@Data
public class Product extends BaseEntity {

    private String name;
    private Integer prepTime;
    private Integer feedablePersons;

    @OneToMany
    private List<AddonGroup> allowedAddons;

    @ManyToOne
    private Cuisine cousine;

    @ManyToOne
    private Store store;
}
