package com.kafka.test;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

    @KafkaListener(topics = "MyTech", groupId = "groupId")
    void listener(String data){
        System.out.println("Listner received: " + data + ":)");
    }
}
