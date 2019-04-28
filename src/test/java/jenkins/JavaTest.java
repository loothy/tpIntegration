package jenkins;

import static org.junit.Assert.assertEquals;



public class JavaTest {
	@org.junit.Test
	public void JaprendJunit() {
		assertEquals(3,calcule.calculeNb(3));
		assertEquals(3,calcule.calculeNbAvecErreur(2));
	}
}
