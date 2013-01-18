
import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

public class MarqueTest {
	private Circuit c1, c2, c3;
	private Voiture v1, v2, v3;
	private ArrayList<Circuit> lesCircuits;
	private ArrayList<Voiture> lesVoitures1;
	private ArrayList<Voiture> lesVoitures2;
	private ArrayList<Voiture> lesVoitures3;
	Marque m1 = new Marque("BMW");
	
	@Before
	public void setUp() throws Exception {
		lesVoitures1 = new ArrayList<Voiture>();
		lesVoitures2 = new ArrayList<Voiture>();
		lesVoitures3 = new ArrayList<Voiture>();
		lesCircuits = new ArrayList<Circuit>();
		
		v1 = new Voiture("Renault Mégane II", 1220, 120);
		v2 = new Voiture("Nissan GT-R", 1740, 550);
		v3 = new Voiture("Lexus LFA", 1485, 560);
		
		lesVoitures1.add(v1);
		lesVoitures2.add(v2);
		lesVoitures3.add(v3);
		
		c1 = new Circuit("Le Mans",9,1000,20,lesVoitures1);
		c2 = new Circuit("Motegi",4,1500,20,lesVoitures2);
		c3 = new Circuit("Nürburgring",20,3000,30,lesVoitures3);
		
		lesCircuits.add(c1);
		lesCircuits.add(c2);
		lesCircuits.add(c3);
		m1.setLesCircuits(lesCircuits);
	}

	@Test
	public void testcircuitsAyantUneLongueurMinimale() {
		ArrayList <Circuit> lesCircuits1 = new ArrayList<Circuit>();
		lesCircuits1.add(c3);
		assertEquals("Longueur Paramètre différente du Circuit : INCORRECT",lesCircuits1, m1.circuitsAyantUneLongueurMinimale(10));
	}
	
	@Test
	public void testcircuitsAyantUnTypeDeVoiture() {
		ArrayList <Circuit> lesCircuits2 = new ArrayList<Circuit>();
		lesCircuits2.add(c2);
		assertEquals("Type de voiture différente : INCORRECT",lesCircuits2,m1.circuitsAyantUnTypeDeVoiture("Nissan GT-R"));
	}
	
	@Test
	public void testcircuitAyantLaVoitureLaPlusPuissante(){
		assertEquals("INCORRECT - Mauvais Circuit",c3,m1.circuitAyantLaVoitureLaPlusPuissante());
	}
	
	@Test
	public void testcaMarque(){
		/*ArrayList <Circuit> lesCircuits3 = new ArrayList<Circuit>();
		lesCircuits3.add(c1);
		lesCircuits3.add(c2);
		lesCircuits3.add(c3);*/
		assertTrue("INCORRECT - Valeur différente",m1.caMarque()==6900);
		
	}

}
