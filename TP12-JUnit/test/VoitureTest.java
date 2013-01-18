
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class VoitureTest {
	private Voiture v1;
	
	@Before
	public void setUp() throws Exception {
		v1 = new Voiture("Renault Mégane II", 1220, 10);
	}

	@Test
    public void testVoiture() {
            assertNotNull("Faux",v1);
    }
	
	@Test
	 public void testrapportPoidsPuissance(){
        assertTrue("Rapport Poids/Puissance : INCORRECT",v1.rapportPoidsPuissance()==122);
	}
}
