package uvsq21921358;

import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;

public class RpnTest {

	@Test
	public void testRpn() {
		Interpreteur i = new Interpreteur();
		i.log("Bonjour");
		assertEquals("Bonjour", i.getLastLog());

	}
}
