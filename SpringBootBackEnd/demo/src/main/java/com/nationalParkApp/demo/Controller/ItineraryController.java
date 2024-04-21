package com.nationalParkApp.demo.Controller;

import com.nationalParkApp.demo.Model.Itinerary;
import com.nationalParkApp.demo.service.ItineraryService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@CrossOrigin(origins = "http://localhost:5173")
@RestController
@RequestMapping("/api/v1/")
public class ItineraryController {

    private ItineraryService itineraryService;

    public ItineraryController(ItineraryService itineraryService) {
        this.itineraryService = itineraryService;
    }

    @PostMapping("/itinerary")
    public Itinerary createItinerary(@RequestBody Itinerary itinerary) { return itineraryService.createItinerary(itinerary); }

    @DeleteMapping(path = "/user")
    public ResponseEntity<Object> deleteItinerary(@RequestBody Long id) {
        boolean deleted = false;
        deleted = itineraryService.deleteItinerary(id);
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", deleted);
        return ResponseEntity.ok(response);
    }

    @GetMapping(path = "/itinerary/{parkCode}")
    public List<Itinerary> getAllItinerariesByParkCode(@PathVariable String parkCode) {
        return itineraryService.getAllItinerariesByParkCode(parkCode);
    }

    @GetMapping(path = "/user")
    public List<Itinerary> getAllItinerariesByUserId(@RequestBody Long id) {
        return itineraryService.getAllItinerariesByUserId(id);
    }
}
