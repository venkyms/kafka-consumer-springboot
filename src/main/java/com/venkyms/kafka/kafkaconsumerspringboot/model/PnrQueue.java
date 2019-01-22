package com.venkyms.kafka.kafkaconsumerspringboot.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PnrQueue {
    private String city;
    private String pnrLocator;
    private String action;
    private String priority;

    public String getCity() {
        return city;
    }

    public PnrQueue withCity(String city) {
        this.city = city;
        return this;
    }

    public String getPnrLocator() {
        return pnrLocator;
    }

    public PnrQueue withPnrLocator(String pnrLocator) {
        this.pnrLocator = pnrLocator;
        return this;
    }

    public String getAction() {
        return action;
    }

    public PnrQueue withAction(String action) {
        this.action = action;
        return this;
    }

    public String getPriority() {
        return priority;
    }

    public PnrQueue setPriority(String priority) {
        this.priority = priority;
        return this;
    }

    @Override
    public String toString() {
        return "PnrQueue{" +
                "city='" + city + '\'' +
                ", pnrLocator='" + pnrLocator + '\'' +
                ", action='" + action + '\'' +
                ", priority='" + priority + '\'' +
                '}';
    }
}
