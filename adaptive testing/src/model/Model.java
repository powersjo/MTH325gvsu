package model;

import java.util.Random;

public class Model {

	private String answers;
	private String[] subjects;
	private int[] used;
	private int[] number;
	private int[] current;
	private String[][] key;
	private int inARow, tempRandom, userCorrect, questionsAsked;
	public Model() {
		subjects = new String[8];
		number = new int[10];
		used = new int[10];
		key = new String[8][10];
		tempRandom = 0;
		userCorrect = 0;
		inARow = 0;
		answers = "";
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
		key[0][9] = "d";
		key[1][0] = "d";
		key[1][1] = "a";
		key[1][2] = "c";
		key[1][3] = "e";
		key[1][4] = "b";
		key[1][5] = "d";
		key[1][6] = "b";
		key[1][7] = "a";
		key[1][8] = "d";
		key[1][9] = "a";
		key[2][0] = "c";
		key[2][1] = "b";
		key[2][2] = "e";// need to evaluate this question and answer.
		key[2][3] = "e";
		key[2][4] = "b";
		key[2][5] = "c";
		key[2][6] = "b"; // check this one with the picture.
		key[2][7] = "e";
		key[2][8] = "e";
		key[2][9] = "e";// not in picture hopefully this is the answer.
		key[3][0] = "e";
		key[3][1] = "d";
		key[3][2] = "b";
		key[3][3] = "a";
		key[3][4] = "d";
		key[3][5] = "a";
		key[3][6] = "a";
		key[3][7] = "d";
		key[3][8] = "d";
		key[3][9] = "c";
		key[4][0] = "d";
		key[4][1] = "c";
		key[4][2] = "d";
		key[4][3] = "c";
		key[4][4] = "d";
		key[4][5] = "c";
		key[4][6] = "b";
		key[4][7] = "c";
		key[4][8] = "b";
		key[4][9] = "b";
		key[5][0] = "a";
		key[5][1] = "a";
		key[5][2] = "b";
		key[5][3] = "a";
		key[5][4] = "d";
		key[5][5] = "d";
		key[5][6] = "d";
		key[5][7] = "e";
		key[5][8] = "e";
		key[5][9] = "c";
		key[6][0] = "b";
		key[6][1] = "c";
		key[6][2] = "c";
		key[6][3] = "c";
		key[6][4] = "d";
		key[6][5] = "c";
		key[6][6] = "d";
		key[6][7] = "c";
		key[6][8] = "a";
		key[6][9] = "b";
		key[7][0] = "d";
		key[7][1] = "a";
		key[7][2] = "a";
		key[7][3] = "d";
		key[7][4] = "b";
		key[7][5] = "a";
		key[7][6] = "a";
		key[7][7] = "e";
		key[7][8] = "b";
		key[7][9] = "e";
		
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
	private void recordResult(String ans) {
		answers = answers + ans + "\n";
		System.out.println(answers);
	}
	public void checkAnswer(String answer) {
		if(key[current[0]][current[1]].equals(answer)) {
			userCorrect++;
			inARow++;
			String temp = subjects[current[0]] + ", " + current[1] + ", correct.";
			recordResult(temp);
		} else {
			inARow = 0;
			userCorrect--;
			String temp = subjects[current[0]] + ", " + current[1] + ", incorrect.";
			recordResult(temp);
		}
	}
	private void newRandom() {
		Random randomGen = new Random();
		tempRandom = randomGen.nextInt(8) + 2;
	}
	private int nextQuestion() {
		current[1]++;
		//newRandom();
		//used[0] = tempRandom;
		//int i = 0;
		//while (i < 1) {
		//	if (used[i] == current[1]) {
		//		newRandom();
		//		used[0] = tempRandom;
		//	} else {
		//		i = 1;
		//	}
		//}
		//for (int k = 9; k > questionsAsked; k--) {
		//	if (used[k] != 0) {
		//		used[k] = tempRandom;
		//		k = -1;
		//	} 
		//}
		//System.out.println(tempRandom);
		//current[1] = tempRandom;
		return current[1];
	}
	public String getSubject() {
		if (userCorrect == 3) {
			current[0]++;
		}
		if (inARow == 3) {
			current[0]++;
			inARow = 0;
		}
		if (userCorrect == -3) {
			current[0] = current[0] - 2;
			if (current[0] < 0) {
				current[0] = 0;
			}
		}
		return subjects[current[0]];
	}
	public int getQuestion() {
		return nextQuestion();
	}
}