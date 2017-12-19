package fr.unilim.iut.fizzbuzz;

public class Bang extends isSomething {
	
	@Override
	public boolean something(Integer nombre) {
		if (0 == nombre % 7) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public String mot() {
		return "bang";
	}
}
