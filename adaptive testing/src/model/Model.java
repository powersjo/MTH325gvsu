package model;

import java.util.Random;

public class Model {

	private String[] subjects;
	private int[] number;
	private int[] current;
	private String[][] key;
	public Model() {
		subjects = new String[8];
		number = new int[10];
		key = new String[8][10];
		/*
		 * Create the Key
		 */
		key[0][0] = "a";
		key[0][1] = "e";
		key[0][2] = "e";
		key[0][3] = "e";
		key[0][4] = "a";
		key[0][5] = "a";
		key[0][6] = "c";
		key[0][7] = "b";
		key[0][8] = "b";
		key[0][9] = "d";//////////////////
		key[1][0] = "";
		key[1][1] = "";
		key[1][2] = "";
		key[1][3] = "";
		key[1][4] = "";
		key[1][5] = "";
		key[1][6] = "";
		key[1][7] = "";
		key[1][8] = "";
		key[1][9] = "";
		key[2][0] = "";
		key[2][1] = "";
		key[2][2] = "";
		key[2][3] = "";
		key[2][4] = "";
		key[2][5] = "";
		key[2][6] = "";
		key[2][7] = "";
		key[2][8] = "";
		key[2][9] = "";
		key[3][0] = "";
		key[3][1] = "";
		key[3][2] = "";
		key[3][3] = "";
		key[3][4] = "";
		key[3][5] = "";
		key[3][6] = "";
		key[3][7] = "";
		key[3][8] = "";
		key[3][9] = "";
		key[4][0] = "";
		key[4][1] = "";
		key[4][2] = "";
		key[4][3] = "";
		key[4][4] = "";
		key[4][5] = "";
		key[4][6] = "";
		key[4][7] = "";
		key[4][8] = "";
		key[4][9] = "";
		key[5][0] = "";
		key[5][1] = "";
		key[5][2] = "";
		key[5][3] = "";
		key[5][4] = "";
		key[5][5] = "";
		key[5][6] = "";
		key[5][7] = "";
		key[5][8] = "";
		key[5][9] = "";
		key[6][0] = "";
		key[6][1] = "";
		key[6][2] = "";
		key[6][3] = "";
		key[6][4] = "";
		key[6][5] = "";
		key[6][6] = "";
		key[6][7] = "";
		key[6][8] = "";
		key[6][9] = "";
		key[7][0] = "";
		key[7][1] = "";
		key[7][2] = "";
		key[7][3] = "";
		key[7][4] = "";
		key[7][5] = "";
		key[7][6] = "";
		key[7][7] = "";
		key[7][8] = "";
		key[7][9] = "";
		
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
		current[1] = 1;
		
	}
	private int randomStart() {
		Random randomGen = new Random();
		int temp = randomGen.nextInt(3) + 2;
		return temp;
	}
	/**
	 * record the result of the answer in a text file.
	 * @param ans
	 */
	public void recordResult(String ans) {
		
	}
	private boolean isCorrect(int subject, int question) {
		return false;
	}
	public int nextQuestion() {
		int temp[] = new int[2];
		//temp[0] = subject;
		//temp[1] = question;
		return current[1];
	}
	public String getSubject() {
		return subjects[current[0]];
	}
	public int getQuestion() {
		return current[1];
	}
}