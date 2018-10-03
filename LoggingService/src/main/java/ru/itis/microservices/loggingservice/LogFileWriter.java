package ru.itis.microservices.loggingservice;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.io.*;
import java.nio.charset.StandardCharsets;

/**
 * @author Bulat Giniyatullin
 * 03 October 2018
 */

@Component
public class LogFileWriter{
    private Writer writer;

    @Value("${custom.logging.file}")
    private String fileName;

    @PostConstruct
    public void init() throws FileNotFoundException {
        writer = new BufferedWriter(
                new OutputStreamWriter(
                        new FileOutputStream(fileName, true), StandardCharsets.UTF_8));
    }

    public void write(String msg) throws IOException {
        writer.write(msg);
    }

    @PreDestroy
    public void destroy() throws IOException {
        writer.close();
    }
}
