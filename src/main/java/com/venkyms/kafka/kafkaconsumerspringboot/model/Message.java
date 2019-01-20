package com.venkyms.kafka.kafkaconsumerspringboot.model;

public class Message {
    private String city;
    private String pnrlocator;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPnrlocator() {
        return pnrlocator;
    }

    public void setPnrlocator(String pnrlocator) {
        this.pnrlocator = pnrlocator;
    }
}
