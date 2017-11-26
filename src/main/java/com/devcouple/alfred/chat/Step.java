package com.devcouple.alfred.chat;

import lombok.Data;

import javax.persistence.Entity;
import java.util.List;

@Data
@Entity
public class Step {
    private List<Phrase> phrases;
    private ReturnType expectedReturn;

}
