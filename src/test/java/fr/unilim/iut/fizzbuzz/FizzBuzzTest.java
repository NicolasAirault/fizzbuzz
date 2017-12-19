package fr.unilim.iut.fizzbuzz;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {

	private FizzBuzz fizzBuzz;

	@Before
	public void setup() {
		fizzBuzz = new FizzBuzz();
	}

	@Test
	public void doitRepondre_fizz_PourUnNombreMultipleDe3() {
		assertEquals("fizz", fizzBuzz.donnerLaReponsePour(3));
		assertEquals("fizz", fizzBuzz.donnerLaReponsePour(6));
		assertEquals("fizz", fizzBuzz.donnerLaReponsePour(9));
	}

	@Test
	public void doitRepondre_buzz_PourUnNombreMultipleDe5() {
		assertEquals("buzz", fizzBuzz.donnerLaReponsePour(5));
		assertEquals("buzz", fizzBuzz.donnerLaReponsePour(10));
		assertEquals("buzz", fizzBuzz.donnerLaReponsePour(20));
	}
	
	@Test
	public void doitRepondre_bang_PourUnNombreMultipleDe7() {
		assertEquals("bang", fizzBuzz.donnerLaReponsePour(7));
		assertEquals("bang", fizzBuzz.donnerLaReponsePour(14));
		assertEquals("bang", fizzBuzz.donnerLaReponsePour(77));
	}
}