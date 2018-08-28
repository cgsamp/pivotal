import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import demo.Passenger;
import demo.Transport;
import demo.Trip;


public class PersistenceTest {

	@Test
	void testPassenger() {
		Passenger p = new Passenger("Alice");

		assertNotNull(p);
		assertEquals(p.getName(),"Alice");		
		assertNotEquals(p.getName(),"Bob");
	}

	@Test
	void testTransport() {
		Transport t = new Transport("Mustang");

		assertNotNull(t);
		assertEquals(t.getName(),"Mustang");
		assertNotEquals(t.getName(),"Camaro");
	}

	@Test
	void testTrip() {
		Trip t = new Trip("Ann Arbor", "Dearborn", new Long(30));

		assertNotNull(t);
		assertEquals(t.getOrigin(),"Ann Arbor");
		assertEquals(t.getDestination(),"Dearborn");
		assertEquals(t.getDistance(),new Long(30));
	}
}	
