package service.dto;

import service.domain.MusicEvent;

public class MusicEventDTO extends EventDTO {

    private PersonDTO actor;

    public MusicEventDTO(MusicEvent event) {
        super(event, "/context/music-event.json");
        actor = new PersonDTO(event.getActor());
    }

    public PersonDTO getActor() {
        return actor;
    }

    public void setActor(PersonDTO actor) {
        this.actor = actor;
    }
}
