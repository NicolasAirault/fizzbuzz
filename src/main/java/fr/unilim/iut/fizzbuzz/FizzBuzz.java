package fr.unilim.iut.fizzbuzz;

public class FizzBuzz {

	private isSomething fizz;
	private isSomething buzz;
	private isSomething bang;

	public String donnerLaReponsePour(Integer nombre) {
		String mot = "";
		fizz = new Fizz();
		buzz = new Buzz();
		bang = new Bang();

		if (fizz.something(nombre)) {
			mot = mot + fizz.mot();
		}

		if (buzz.something(nombre)) {
			mot = mot + buzz.mot();
		}

		if (bang.something(nombre)) {
			mot = mot + bang.mot();
		}

		return mot;
	}
}