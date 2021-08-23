package day06;

import java.util.Random;

public class Teacher {
	private String fio;
	private String subject;

	public Teacher(String fio, String subject) {
		this.fio = fio;
		this.subject = subject;
	}

	public String getFio() {
		return fio;
	}

	public void setFio(String fio) {
		this.fio = fio;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public void evaluate(Student student) {
		Random random = new Random();
		int randomValue = random.nextInt(4) + 2;

		String evaluation = "";
		switch (randomValue) {
		case 2:
			evaluation = "very bad";
			break;
		case 3:
			evaluation = "unsatisfactory";
			break;
		case 4:
			evaluation = "good";
			break;
		case 5:
			evaluation = "excellent";
			break;
		}
		System.out.println("The teacher " + this.fio + " evaluated student " + student.getFio() + " on the subject "
				+ this.subject + " with a grade of  " + evaluation);

	}
}
