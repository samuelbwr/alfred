package com.devcouple.alfred.session;

import com.devcouple.alfred.chat.Chat;
import com.devcouple.alfred.location.Location;
import com.devcouple.alfred.order.Order;
import com.devcouple.alfred.foodcharacteristic.Characteristic;
import com.devcouple.alfred.session.publics.Public;
import com.devcouple.alfred.session.restriction.Restriction;
import com.devcouple.alfred.user.User;
import lombok.Data;

import java.util.List;

@Data
public class Session {

    private Chat chat;
    private User user;
    private List<Restriction> restrictions;
    private Public sessionPublic;
    private List<Characteristic> characteristics;
    private Location location;
    private Boolean isPickup;
    private Order order;
    private Integer budget;
}
