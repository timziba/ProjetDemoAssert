package demoAssetJunit;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.hamcrest.core.Is;
import org.hamcrest.core.IsNot;
import org.hamcrest.core.IsNull;

import static org.hamcrest.CoreMatchers.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

public class DemoTest {

	private static Personne personne;
	
	
	@Test
	public void  testAssertEquals() {
		assertEquals("shohld be equals", 155, 155);
	}
	
	@Test
	public void testAssertFalse() {
		assertFalse("should be false", false);
	}
	
	@Test
	public void testAssertTrue() {
		assertTrue("shloud be true", true);
	}
	
	@Test
	public void testAssertNotSame() {
		assertNotSame("should not  be the same ", 72, 33);
	}
	
	/*@Test
	public void testFail() {
		fail("should be failed");
	}
	*/
	@Test
	public void testAssertSame() {
		String toto = "toto";
		String tata = "toto";
		assertSame("Should be the same object",toto , tata);
	}
	
	@Test
	public void testAssertNull() {
		assertNull("should be null", null);
	}
	
	@Test
	public void testAssertArrayEquals() {
		char toto []= {'c','s'};
		char tata []= {'c','s'};
		assertArrayEquals(" toto and tata should be have equals char", toto, tata);
		
	}
	
	@Test
	public void testAssertThat() {
		String titi= null;
		assertThat("0 is not 1", 0 ,IsNot.not(1));
		assertThat("The string is not null",titi, IsNull.nullValue());
				
	}
	
	/*@BeforeClass
	public static void initialisationpersonne() {
		personne = new Personne("ba", "fatima");
		System.out.println(personne.getPrenom()+personne.getNom());
	}
	
	@After
	 public void afterInitialisation() {
		System.out.println("after initialisation donc liberation des ressources");
	}
	
	@Before
	public void beforInitialisation() {
		System.out.println("Avant l'initialisation");
	}
	
	@AfterClass
	public static void deletePersonne() {
		System.out.println("delete personne donc libération de la mémoire");
		personne=null;
	}
	
	*/
	
	///Apres ajout junit 5 les fixtures change
	
	@BeforeAll
	public static void initialisationpersonne() {
		personne = new Personne("ba", "fatima");
		System.out.println(personne.getPrenom()+personne.getNom());
	}
	
	@AfterEach
	 public void afterInitialisation() {
		System.out.println("after initialisation donc liberation des ressources");
	}
	
	@BeforeEach
	public void beforInitialisation() {
		System.out.println("Avant l'initialisation");
	}
	
	@AfterAll
	public static void deletePersonne() {
		System.out.println("delete personne donc libération de la mémoire");
		personne=null;
	}
}
