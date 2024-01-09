package demo.rabbitmq.controller;

import demo.rabbitmq.bean.Customer;
import demo.rabbitmq.publisher.RabbitMQProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MessageController {

    @Autowired
    private RabbitMQProducer rabbitMQProducer;

    @PostMapping("/publish")
    public ResponseEntity<String> sendMessage(@RequestBody Customer body) {

        return ResponseEntity.status(HttpStatus.CREATED).body("Message send to RabbitMQ...");
    }
}
