package service.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import service.dto.EventCollectionDTO;
import service.dto.EventDTO;
import service.repository.SimpleRepository;

@RestController
@RequestMapping("/events")
public class EventsController {

    @Autowired
    private SimpleRepository simpleRepository;

    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public EventCollectionDTO events() {
        return new EventCollectionDTO(simpleRepository.getEvents().values());
    }

    @RequestMapping("/{id}")
    @ResponseBody
    public EventDTO event(@PathVariable Integer id) {
        return simpleRepository.getEvents().get(id).asJsonLd();
    }
}
