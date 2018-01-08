package service.domain;

import java.util.concurrent.atomic.AtomicInteger;

public class SportsTeam {

    private static AtomicInteger ids = new AtomicInteger();
    private Integer identifier = ids.getAndIncrement();

    private String name = "SportsTeam " + identifier;

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
