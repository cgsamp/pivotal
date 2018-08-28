package demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.beans.factory.annotation.Autowired;

import demo.Passenger;
import demo.PassengerRepository;

@RestController
public class MobilityRestController {

 	Logger logger = LoggerFactory.getLogger(MobilityRestController.class);
    @Autowired private PassengerRepository passengerRepository;
    @Autowired private TransportRepository transportRepository;
    @Autowired private TripRepository tripRepository;

    @GetMapping(value="/mobility/add/passenger")
    public String addPassenger(@RequestParam(value="name") String name) {
    	passengerRepository.save(new Passenger(name));
    	logger.info("Saving passenger " + name);
    	return "Saved passenger " + name;
    }

    @GetMapping(value="/mobility/add/transport")
    public String addTransport(@RequestParam(value="name") String name) {
    	logger.info("Saving transport " + name);
    	transportRepository.save(new Transport(name));
    	return "Saved transport " + name;
    }

    @GetMapping(value="/mobility/add/trip")
    public String addPassenger(
    	@RequestParam(value="origin") String origin,
    	@RequestParam(value="destination") String destination,
    	@RequestParam(value="distance") Long distance
    ) {
    	logger.info("Saving trip " + String.join(",", origin, destination, distance.toString()));
    	tripRepository.save(new Trip(origin, destination, distance));
    	return "Saved trip " + origin;
    }
}
