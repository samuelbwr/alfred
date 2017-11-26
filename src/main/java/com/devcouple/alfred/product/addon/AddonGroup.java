package com.devcouple.alfred.product.addon;

import com.devcouple.alfred.app.BaseEntity;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
@Data
public class AddonGroup extends BaseEntity{
    private String name;
    @OneToMany
    private List<Addon> addons;
    private Integer allowedSelection;
}
