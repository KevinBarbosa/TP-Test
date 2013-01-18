import static org.junit.Assert.*;
import java.util.ArrayList;
import org.junit.Before;
import org.junit.Test;

public class CircuitTest{
	private Circuit c1;
	private Voiture v1, v2, v3;
	private ArrayList<Voiture> lesVoitures;
	
	@Before
	public void setUp() throws Exception {
		lesVoitures = new ArrayList<Voiture>();
		v1 = new Voiture("Renault Mégane II", 1220, 120);
		v2 = new Voiture("Nissan GT-R", 1740, 550);
		v3 = new Voiture("Lexus LFA", 1485, 560);
		
		lesVoitures.add(v1);
		lesVoitures.add(v2);
		lesVoitures.add(v3);
		
		c1 = new Circuit("Le Mans",9,1000,20,lesVoitures);
}
	@Test
    public void testPrixVente(){
            assertTrue("Prix de vente : INCORRECT",c1.prixVente()==1200);
    }
    
    @Test
    public void testCircuit() {
            assertNotNull("Circuit vide ou non existant",c1);
    }
    
	@Test
	public void testvoitureLaPlusPuissanteDuCircuit() {
		assertEquals("Erreur de voiture",v3,c1.voitureLaPlusPuissanteDuCircuit());
	}
	
	

}
