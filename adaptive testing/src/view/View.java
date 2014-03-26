package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import model.Model;

@SuppressWarnings("serial")
public class View extends JFrame{

	Model model;
	JPanel top, bottom;
	JButton button1, button2, button3, button4, button5, button6;
	public View() {
		// TODO Auto-generated constructor stub
		model =  new Model();
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
	public void setPictureQuestion() {
		
	}
	/**
	 * @param num the number of buttons applicable to a multiple choice question.
	 */
	private void adjustButtons(int num) {
		
	}

}
