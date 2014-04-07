package model;

import java.util.Random;

public class Model {

	private String[] subjects;
	private int[] number;
	private int[] current;
	public Model() {
		subjects = new String[8];
		number = new int[10];
		subjects[0] = "prealgebra";
		subjects[1] = "algebra";
		subjects[2] = "geometry";
		subjects[3] = "collalgebra";
		subjects[4] = "trig";
		subjects[5] = "precalc";
		subjects[6] = "calc1";
		subjects[7] = "calc2";
		for (int i = 0; i < 10; i++) {
			number[i] = i;
		}
		current = new int[2];
		current[0] = randomStart();
		current[1] = 0;
		
	}
	private int randomStart() {
		Random randomGen = new Random();
		int temp = randomGen.nextInt(3) + 2;
		return temp;
	}
	/**
	 * record the result of the answer in a text file.
	 * @param num
	 */
	public void recordResult(int num, boolean answer) {
		
	}
	private boolean isCorrect(int subject, int question) {
		return false;
	}
	public int nextQuestion(int subject, int question) {
		int temp[] = new int[2];
		temp[0] = subject;
		temp[1] = question;
		return current[1];
	}
	public String getSubject() {
		return subjects[current[0]];
	}
	public int getQuestion() {
		return current[1];
	}
}