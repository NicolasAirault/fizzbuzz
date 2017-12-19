package fr.unilim.iut.fizzbuzz;

public class Buzz extends isSomething {

	@Override
	public boolean something(Integer nombre) {
		if (0 == nombre % 5) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public String mot() {
		return "buzz";
	}
}
