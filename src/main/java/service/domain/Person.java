package service.domain;

import java.util.concurrent.atomic.AtomicInteger;

public class Person {

    private static AtomicInteger ids = new AtomicInteger();
    private Integer identifier = ids.getAndIncrement();

    private String name = "Person " + identifier;

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
