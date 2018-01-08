package service.domain;

import service.dto.EventDTO;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;


public class Event {

    private static AtomicInteger ids = new AtomicInteger();
    private Integer identifier = ids.getAndIncrement();
    private String name = "Event " + identifier;
    private String startTime;
    private String endTime;

    public Integer getIdentifier() {
        return identifier;
    }

    public void setIdentifier(Integer identifier) {
        this.identifier = identifier;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public EventDTO asJsonLd(){
        return new EventDTO(this);
    }
}
