package service.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import service.domain.Event;


@JsonInclude(JsonInclude.Include.NON_NULL)
public class EventCollectionItemDTO extends JsonLdDTO {

    private String name;

    public EventCollectionItemDTO(Event event) {
        super(null, "/events/" + event.getIdentifier(), "Event");
        name = event.getName();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
