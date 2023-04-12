package com.kafka.test.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopic {

    public NewTopic mytechTopic(){
        return TopicBuilder.name("MyTech")
                .build();
    }
}
