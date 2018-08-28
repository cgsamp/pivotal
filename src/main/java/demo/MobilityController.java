package demo;

import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.beans.factory.annotation.Autowired;

import demo.Passenger;
import demo.PassengerRepository;

@Controller
public class MobilityController {

    @Autowired private PassengerRepository passengerRepository;
    @Autowired private TransportRepository transportRepository;
    @Autowired private TripRepository tripRepository;
    @Autowired private RideRepository rideRepository;

    @GetMapping("/mobility")
    public String mobility(Model model) {
        model.addAttribute("passengers", passengerRepository.findAll());
        model.addAttribute("transports", transportRepository.findAll());
        model.addAttribute("trips", tripRepository.findAll());
        System.out.println( rideRepository.getPossibleRides());
        model.addAttribute("rides", rideRepository.getPossibleRides());
        return "mobility";
    }
}
