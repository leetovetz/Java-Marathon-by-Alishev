package day07;

public class Task1 {

	public static void main(String[] args) {
		Airplane airplane1 = new Airplane("Boeing", 2010, 30, 40000, 0);
		Airplane airplane2 = new Airplane("Boeing", 2011, 20, 30000, 0);

		Airplane.compareAirplanes(airplane1, airplane2);

	}

}
