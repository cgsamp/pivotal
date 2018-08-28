package demo;

import java.util.List;
import org.springframework.data.repository.Repository;
import org.springframework.data.jpa.repository.Query;


public interface RideRepository extends Repository<Ride, Long> {
	@Query(
		value="select rand()*10000 as id, passenger.name as passenger, transport.name as transport, trip.origin, trip.destination, trip.distance from passenger, transport, trip",
		nativeQuery=true)
	public List<Ride> getPossibleRides();
}
