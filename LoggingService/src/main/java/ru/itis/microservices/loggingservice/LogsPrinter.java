package ru.itis.microservices.loggingservice;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import java.io.*;

/**
 * @author Bulat Giniyatullin
 * 02 October 2018
 */

@Component
public class LogsPrinter {
    @Autowired
    LogFileWriter logWriter;

    @KafkaListener(topics = "logs")
    public void listen(ConsumerRecord<?, ?> consumerRecord) throws IOException {
        String value = (String) consumerRecord.value();
        System.out.print(value);
        logWriter.write(value);
    }
}
