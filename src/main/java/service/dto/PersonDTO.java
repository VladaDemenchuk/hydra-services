package service.dto;

import service.domain.Person;

public class PersonDTO extends JsonLdDTO {

    private Integer identifier;
    private String name;

    public PersonDTO(Person person) {
        super("/context/person.json", "/people/" + person.getIdentifier(), "Person");
        identifier = person.getIdentifier();
        name = person.getName();
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
}
