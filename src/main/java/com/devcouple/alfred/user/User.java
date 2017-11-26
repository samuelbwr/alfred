package com.devcouple.alfred.user;

import com.devcouple.alfred.app.BaseEntity;
import com.devcouple.alfred.foodcharacteristic.Characteristic;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
@Data
public class User extends BaseEntity{
    private String name;
    private String email;
    private String password;

    @OneToMany
    private List<Characteristic> knownCharacteristics;
}
