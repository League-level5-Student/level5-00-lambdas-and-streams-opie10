package _00_JButtons_with_Lambdas;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class LambdaButtons implements ActionListener {
	private JFrame window = new JFrame();
	private JButton addNumbers = new JButton("ADD 2 Numbers");
	private JButton randNumber = new JButton("RANDOM NUMBER");
	private JButton tellAJoke = new JButton("TELL A JOKE");
	
	public LambdaButtons() {
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setLayout(new FlowLayout());
		window.add(addNumbers);
		window.add(randNumber);
		window.add(tellAJoke);
		
		//1. Call the addActionListener methods for each button. Use lambdas
		//   to define to functionality of the buttons.
		addNumbers.addActionListener((s)->{
			int num1 =Integer.parseInt(JOptionPane.showInputDialog("Input First Number:")) ;
			int num2 =Integer.parseInt(JOptionPane.showInputDialog("Input Second Number:")) ;
			JOptionPane.showMessageDialog(null, "The Result: "+(num1+num2));
		});
		randNumber.addActionListener((s)->{
			Random rand = new Random();
			int r = rand.nextInt(100000);
			JOptionPane.showMessageDialog(null, "Here's your random number: "+r);
		});
		tellAJoke.addActionListener((s)->{
			String joke ="You!(Joke)";
			Random rand = new Random();
			int r = rand.nextInt(4);
			if (r==3) {
				joke = "Where do polar bears keep their money? \nAnswer: In a snowbank!";
			}
			if (r==1) {
				joke = "What would bears be without bees?\nAnswer: Ears!";
			}
			if (r==2) {
				joke = "Why did the bicycle fall over? \nAnswer: Beacuse it was two tired!"	;	
			}
			JOptionPane.showMessageDialog(null, "Heres a joke:\n"+joke);
		});
		window.setVisible(true);
		window.pack();
	}
	
	public static void main(String[] args) {
		new LambdaButtons();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

	
	
	
	
}
