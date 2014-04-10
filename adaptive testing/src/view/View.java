package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import model.Model;

@SuppressWarnings("serial")
public class View extends JFrame{

	Model model;
	JPanel top, bottom;
	JButton button1, button2, button3, button4, button5;
	public View(Model m) {
		model = m;
		top = new JPanel();
		top.setBackground(Color.lightGray);
		top.setPreferredSize(new Dimension(500, 350));
		bottom = new JPanel();
		bottom.setBackground(Color.gray);
		bottom.setPreferredSize(new Dimension(500, 200));
		setLayout(new BorderLayout());
		setPictureQuestion();
		add(top, BorderLayout.NORTH);
		button1 = new JButton("A");
		button2 = new JButton("B");
		button3 = new JButton("C");
		button4 = new JButton("D");
		button5 = new JButton("E");
		bottom.setLayout(new GridLayout(1,5));
		bottom.add(button1);
		bottom.add(button2);
		bottom.add(button3);
		bottom.add(button4);
		bottom.add(button5);
		add(bottom, BorderLayout.SOUTH);
		setPreferredSize(new Dimension(700, 600));
		pack();
		setVisible(true);
	}
	public void setPictureQuestion() {
		String tempString = model.getSubject();
		String tempInt = String.valueOf(model.getQuestion());
		BufferedImage myPicture = null;
		try {
			myPicture = ImageIO.read(this.getClass().getResource("/images/answers/"+tempString+"/"+tempInt+".png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		JLabel picLabel = new JLabel(new ImageIcon(myPicture));
		top.add(picLabel);
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
	 * This class with either get the next question or end the program if the test is done.
	 * 
	 */
	private class ButtonListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			
		}
	}
}
