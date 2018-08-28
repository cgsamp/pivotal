package demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Ride {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String passenger;
	private String transport;
	private String origin;
	private String destination;
	private Long distance;

	protected Ride() {}

	public Ride(String passenger, String transport, String origin, String destination, Long distance) {
		this.passenger= passenger;
		this.transport = transport;
		this.origin = origin;
		this.destination = destination;
		this.distance = distance;
	}

	public Long getId() {
		return id;
	}

	public String getPassenger() {
		return passenger;
	}

	public String getTransport() {
		return transport;
	}

	public String getOrigin() {
		return origin;
	}

	public String getDestination() {
		return destination;
	}

	public Long getDistance() {
		return distance;
	}

	@Override
	public String toString() {
		return String.format("Ride[id=%d, passenger='%s', transport='%s', origin='%s', destination='%s', distance='%d']\n", 
			id,
			passenger, 
			transport,
			origin,
			destination,
			distance
		);
	}
}	
