package demo.rabbitmq.bean;

import lombok.Data;

import java.io.Serializable;

@Data
public class Customer implements Serializable {
    private Long id;
    private String firstName;
    private String lastName;
}
