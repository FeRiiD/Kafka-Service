package com.kafka.test;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.core.KafkaTemplate;

@SpringBootApplication
public class KafkaApplication {

    public static void main(String[] args) {
        SpringApplication.run(KafkaApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(KafkaTemplate<String, String> kafkaTemplate){
        return args -> {
          kafkaTemplate.send("MyTech", "Hello Kafka and welcome at MyTech!");
          kafkaTemplate.send("MyTech", "This is an individual project!");
          kafkaTemplate.send("MyTech", "It is about an enterprise application!");
          kafkaTemplate.send("MyTech", "First of all starting with the user service and kafka!");
        };
    }

}
