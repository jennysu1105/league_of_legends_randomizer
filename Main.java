package league_of_legends_randomizer;

import java.awt.GridLayout;

import javax.swing.JFrame;

public class Main{
	
	private static JFrame window = new JFrame("League of Legends Randomizer");
	
	public static void main(String[] args) {
		Application app = new Application(window);
		
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		window.setSize(1200, 750);
		window.setLayout(new GridLayout(4, 1, 0, 10));
		window.setVisible(true);
	}

}
