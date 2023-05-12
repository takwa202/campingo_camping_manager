package webuild.esprit.tn.tunisiacampwebapplication.Services;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.stereotype.Service;
import webuild.esprit.tn.tunisiacampwebapplication.Entities.Event;
import webuild.esprit.tn.tunisiacampwebapplication.Repositories.EventRepo;

import java.util.List;

@Service
@Slf4j
@AllArgsConstructor
public class EventServices implements IEventServices{

    EventRepo eventRepo;


    @Override
    public Event addEvent(Event event) {

        return eventRepo.save(event);
    }

    @Override
    public List<Event> getAllEvents() {

        return eventRepo.findAll();
    }

    @Override
    public Event findByIdEvent(Integer IdEvent) {
        return eventRepo.findById(IdEvent).orElseThrow(()->new ResourceNotFoundException("Event not found"));
    }

    @Override
    public void removeEventByid(Integer IdEvent) {

        eventRepo.deleteById(IdEvent);
    }

    @Override
    public Event updateEvent(Integer id, Event event) {
        Event e =eventRepo.findById(id).orElseThrow(() -> new ResourceNotFoundException("Event not found"));
        e.setDateEvent(event.getDateEvent());
        e.setLocation(event.getLocation());
        e.setNumberMaxOfUsers(event.getNumberMaxOfUsers());
        e.setPrix(event.getPrix());
        return eventRepo.save(e);
    }
}
