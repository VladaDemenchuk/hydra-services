package service.dto;

import service.domain.SportsTeam;

public class SportsTeamDTO extends JsonLdDTO {

    private Integer identifier;
    private String name;

    public SportsTeamDTO(SportsTeam sportsTeam) {
        super("/context/sports-team.json", "/sports-teams/" + sportsTeam.getIdentifier(), "SportsTeam");
        identifier = sportsTeam.getIdentifier();
        name = sportsTeam.getName();
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
