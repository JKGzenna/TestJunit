import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PersonaTest {
	
	private Persona persona;

	@Before
	public void setUp() throws Exception {
		persona = new Persona("Juan", "Goldaracena");
	}

	@Test
	public void testGetNombre() throws Exception {
		//GIVEN

		//WHEN

		//THEN
		Assert.assertTrue(persona.getNombre().equals("Juan"));
	}

}
