package service.dto;

import service.domain.Event;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class EventCollectionDTO extends JsonLdDTO {

    private List<EventCollectionItemDTO> members;

    public EventCollectionDTO(Collection<Event> events) {
        super("/context/event-collection.json", "/events/", "EventsCollection");
        members = events.stream().map(EventCollectionItemDTO::new).collect(Collectors.toList());
    }

    public List<EventCollectionItemDTO> getMembers() {
        return members;
    }

    public void setMembers(List<EventCollectionItemDTO> members) {
        this.members = members;
    }
}
