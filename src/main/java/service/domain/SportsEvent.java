package service.domain;

import service.dto.SportsEventDTO;

public class SportsEvent extends Event {

    private SportsTeam homeTeam;
    private SportsTeam awayTeam;

    public SportsTeam getHomeTeam() {
        return homeTeam;
    }

    public void setHomeTeam(SportsTeam homeTeam) {
        this.homeTeam = homeTeam;
    }

    public SportsTeam getAwayTeam() {
        return awayTeam;
    }

    public void setAwayTeam(SportsTeam awayTeam) {
        this.awayTeam = awayTeam;
    }

    @Override
    public SportsEventDTO asJsonLd() {
        return new SportsEventDTO(this);
    }
}

