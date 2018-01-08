package service.dto;

import service.domain.Event;

public class EventDTO extends JsonLdDTO {

    private Integer identifier;
    private String name;
    private String startDate;
    private String endDate;

    public EventDTO(Event event) {
        this(event, "/context/event.json");
    }

    public EventDTO(Event event, String context) {
        super(context, "/events/" + event.getIdentifier(), "Event");
        identifier = event.getIdentifier();
        name = event.getName();

        startDate = event.getStartTime();
        endDate = event.getEndTime();
    }

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

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }
}
