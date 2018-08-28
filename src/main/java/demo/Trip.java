package demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Trip {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String origin;
	private String destination;
	private Long distance;

	protected Trip() {}

	public Trip(String origin, String destination, Long distance) {
		this.origin = origin;
		this.destination = destination;
		this.distance = distance;
	}

	public String getOrigin () {
		return origin;
	}

	public String getDestination() {
		return destination;
	}

	public Long getDistance() {
		return distance;
	}

	public Long getId() {
		return id;
	}

	@Override
	public String toString() {
		return String.format(
			"Trip[id=%d, origin='%s' destination='%s' distance=%d]", 
			id, origin, destination, distance
		);
	}
}	
