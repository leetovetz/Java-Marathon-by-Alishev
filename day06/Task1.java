package day06;

public class Task1 {

	public static void main(String[] args) {
		Car car = new Car();
		car.setColor("black");
		car.setModel("audi");
		car.setYear(2015);

		Motorcycle motorbike = new Motorcycle(2018, "kawasaki", "blue");

		car.info();
		motorbike.info();

		System.out.println(car.yearDifference(2020));
		System.out.println(motorbike.yearDifference(2020));

		Airplane airplane = new Airplane("Boeing", 2010, 30, 40000, 0);

		airplane.setYear(2011);
		airplane.setLength(35);
		
		airplane.fillUp(1000);
		airplane.fillUp(5000);
		
		airplane.info();
		
		Teacher teacher = new Teacher("John McClain", "history");
		Student student = new Student("Nicole Kidman");
		
		teacher.evaluate(student);

	}
}
