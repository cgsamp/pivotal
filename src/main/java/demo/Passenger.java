package demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Passenger {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id = new Long(-1);
	private String name;

	protected Passenger() {}

	public Passenger(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public Long getId() {
		return id;
	}

	@Override
	public String toString() {
		return String.format("Passenger[id=%d, name='%s']", id, name);
	}
}	
