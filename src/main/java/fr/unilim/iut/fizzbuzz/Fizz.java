package fr.unilim.iut.fizzbuzz;

public class Fizz extends isSomething {

	@Override
	public boolean something(Integer nombre) {
		if (0 == nombre % 3)
			return true;

		return false;

	}

	@Override
	public String mot() {
		return "fizz";
	}
}
