package fr.unilim.iut.fizzbuzz;

public class FizzBuzz {

	private isSomething fizz;
	private isSomething buzz;
	private isSomething bang;

	public String donnerLaReponsePour(Integer nombre) {
		String mot = "";

		if (fizz.something(nombre)) {
			mot += fizz.mot();
			return mot;
		}

		if (buzz.something(nombre)) {
			mot += buzz.mot();
			return mot;
		}

		if (bang.something(nombre)) {
			mot += bang.mot();
			return mot;
		}

		return mot;
	}
}