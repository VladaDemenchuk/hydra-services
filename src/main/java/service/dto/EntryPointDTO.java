package service.dto;

public class EntryPointDTO extends JsonLdDTO {

    private String events = "/events/";

    public EntryPointDTO() {
        super("/context/entry-point.json", "/", "EntryPoint");
    }

    public String getEvents() {
        return events;
    }

    public void setEvents(String events) {
        this.events = events;
    }
}
