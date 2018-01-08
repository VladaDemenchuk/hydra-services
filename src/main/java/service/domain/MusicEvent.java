package service.domain;

import service.dto.MusicEventDTO;

public class MusicEvent extends Event {

    private Person actor;

    public Person getActor() {
        return actor;
    }

    public void setActor(Person actor) {
        this.actor = actor;
    }

    @Override
    public MusicEventDTO asJsonLd() {
        return new MusicEventDTO(this);
    }
}
