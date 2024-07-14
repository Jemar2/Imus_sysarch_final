package com.bangkas.sysarchbangkas.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Bangka")
public class Bangka {

    @Id
    private String id;
    private String bangkaName;
    private String destination;

    public Bangka(String bangkaName, String destination) {
        this.bangkaName = bangkaName;
        this.destination = destination;
    }

    // Getters and Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBangkaName() {
        return bangkaName;
    }

    public void setBangkaName(String bangkaName) {
        this.bangkaName = bangkaName;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }
}
