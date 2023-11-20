package Exercise43;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class IAdministratorsTest {
/**
 * this is testing for Interface
 */
	@Test
	void testConstructor() {
		IAdministrators b1 = new Buses(7.000, 16, 3);
		IAdministrators l1 = new Limos(190.000, 9, 5, "comfortable");
		IAdministrators s1 = new Subways(5.000, 147, "Metro Line 1", "electric", 3);
		IAdministrators s2 = new Subways(10.000, 294, "Metro Line 2", "electric", 6);
	}

}
