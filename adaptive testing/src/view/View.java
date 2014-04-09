package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import model.Model;

@SuppressWarnings("serial")
public class View extends JFrame{

	Model model;
	JPanel top, bottom;
	JButton button1, button2, button3, button4, button5, button6;
	public View(Model m) {
		model = m;
		top = new JPanel();
		top.setBackground(Color.lightGray);
		top.setPreferredSize(new Dimension(500, 400));
		bottom = new JPanel();
		bottom.setBackground(Color.gray);
		bottom.setPreferredSize(new Dimension(500, 200));
		setLayout(new BorderLayout());
		add(top, BorderLayout.NORTH);
		add(bottom, BorderLayout.SOUTH);
		setPreferredSize(new Dimension(500, 600));
		pack();
		setVisible(true);
	}
	/*
	 * try {
			ImageIcon is;
			if (model.pieceAt(i, k).player() == Player.PLAYER1) {
				if (model.pieceAt(i, k).type() == "king") {
					is = new ImageIcon(getClass().getResource(
							"images/King/king" + player1Color +".png"));
	 */
	public void setPictureQuestion() {
		
	}
	/**
	 * Changes the amount of buttons on the bottom JPanel.
	 * @param num the number of buttons applicable to a multiple choice question.
	 */
	private void adjustButtons(int num) {
		
	}
	/**
	 * 
	 * This method calls the model to get the exact question needed.
	 * @param m
	 * @return int[] a anrray of two values for the question subject and the question number.
	 */
	public int[] getQuestion (Model m) {
		int temp[] = new int[2];
		return temp;
	}
	/**
	 * Pass local button 1, 2, 3 etc to change local button picture.
	 * @param b button to be changed.
	 * @param subject the suject in a 2d array of the possible subject of math.
	 * @param num the number question within that subject in the 2d array.
	 */
	private void setButtonPic(JButton b, int subject, int num) {
		
	}
	/**
	 * This class with either get the next question or end the program if the test is done.
	 * 
	 */
	private class ButtonListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
		
		}
	}
}
