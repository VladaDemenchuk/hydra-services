package service.repository;

import org.springframework.stereotype.Repository;
import service.domain.*;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;

@Repository
public class SimpleRepository {

    private final Random random = new Random();
    private final DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", Locale.US);

    private final HashMap<Integer, Event> events = new HashMap<>();

    SimpleRepository() {

        for (int i = 0; i < random.nextInt(10) + 4; i++) {
            createEvent();
        }
    }

    public Map<Integer, Event> getEvents() {
        return events;
    }

    private void createEvent() {
        Event event;
        if (random.nextBoolean()) {
            event = createMusicEvent();
        } else {
            event = createSportsEvent();
        }
        long startTime = new Date().getTime() + random.nextInt(1_000_000_000) - 500_000_000;
        event.setStartTime(dateFormat.format(new Date(startTime)));
        event.setEndTime(dateFormat.format(new Date(startTime + Math.abs(random.nextInt()))));

        events.put(event.getIdentifier(), event);
    }

    private MusicEvent createMusicEvent() {
        MusicEvent musicEvent = new MusicEvent();
        musicEvent.setActor(new Person());
        return musicEvent;
    }

    private SportsEvent createSportsEvent() {
        SportsEvent sportsEvent = new SportsEvent();
        sportsEvent.setAwayTeam(new SportsTeam());
        sportsEvent.setHomeTeam(new SportsTeam());
        return sportsEvent;
    }
}
