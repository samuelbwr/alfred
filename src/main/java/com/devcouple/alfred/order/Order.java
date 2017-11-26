package com.devcouple.alfred.order;

import com.devcouple.alfred.app.BaseEntity;
import com.devcouple.alfred.product.variation.ProductVariation;
import com.devcouple.alfred.store.Store;
import com.devcouple.alfred.user.User;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Data
public class Order extends BaseEntity {

    @Temporal( TemporalType.TIMESTAMP )
    private Date creation;

    @ManyToMany
    private List<ProductVariation> products;

    @ManyToOne
    private User user;

    @ManyToOne
    private Store store;

}
