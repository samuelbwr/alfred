package com.devcouple.alfred.rating;

import com.devcouple.alfred.app.BaseEntity;
import com.devcouple.alfred.order.Order;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
@Data
public class Rating extends BaseEntity {

    @OneToOne
    private Order order;
    private Short recommendationRating;
    private Short storeRating;
    private Short foodRating;
}
