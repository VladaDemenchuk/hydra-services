package service.dto;

import service.domain.SportsEvent;

public class SportsEventDTO extends EventDTO {

    private SportsTeamDTO homeTeam;
    private SportsTeamDTO awayTeam;

    public SportsEventDTO(SportsEvent event) {
        super(event, "/context/sports-event.json");
        homeTeam = new SportsTeamDTO(event.getHomeTeam());
        awayTeam = new SportsTeamDTO(event.getAwayTeam());
    }

    public SportsTeamDTO getHomeTeam() {
        return homeTeam;
    }

    public void setHomeTeam(SportsTeamDTO homeTeam) {
        this.homeTeam = homeTeam;
    }

    public SportsTeamDTO getAwayTeam() {
        return awayTeam;
    }

    public void setAwayTeam(SportsTeamDTO awayTeam) {
        this.awayTeam = awayTeam;
    }
}