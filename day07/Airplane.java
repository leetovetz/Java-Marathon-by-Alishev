package day07;

public class Airplane {
	private String producer;
	private int year;
	private int length;
	private int weight;
	private int fuel;

	public Airplane(String producer, int year, int length, int weight, int fuel) {
		this.producer = producer;
		this.year = year;
		this.length = length;
		this.weight = weight;
		this.fuel = 0;
	}

	public void info() {
		System.out.println("Manufacturer: " + producer + ", year of manufacture: " + year + ", length: " + length
				+ ", weight: " + weight + ", amount of fuel in tank: " + fuel);
	}

	public void fillUp(int inputFuel) {
		fuel += inputFuel;
	}

	public String getProducer() {
		return producer;
	}

	public void setProducer(String producer) {
		this.producer = producer;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getFuel() {
		return fuel;
	}

	public void setFuel(int fuel) {
		this.fuel = fuel;
	}

	public static void compareAirplanes(Airplane airplane1, Airplane airplane2) {
		if (airplane1.getLength() > airplane2.getLength()) {
			System.out.println("The first plane is longer.");
		} else if (airplane1.getLength() < airplane2.getLength()) {
			System.out.println("The second plane is longer.");
		} else {
			System.out.println("The lengths of the planes are equal.");
		}
	}

}
