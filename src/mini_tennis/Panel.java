/*
 * Panel
 * 
 * $Id$
 * 
 * Copyright 2014 konkara@dmst.aueb.gr
 */
package mini_tennis;

import java.awt.Color;
import javax.swing.JFrame;

/**
 * The program's main window.
 * 
 * @version 1.00 January 2014
 * @author Konstantinos Karakatsanis
 */
public class Panel extends  JFrame {
	
	/** The window's width. */
	protected static final int dimensionX = 1600;
	
	/** The window's height. */
	protected static final int dimensionY = 900;
	
	/** Shows if the game is in the beginning. */
	protected static boolean game_start = true;
	
	/** Shows if the game is over. */
	protected static boolean game_over = false;
	
	/** Serial number of persistent  data. */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Plays the game.
     * Executes the {@link GraphicPanel#paint(java.awt.Graphics)}
     * {@link GraphicPanel#repaint()} and {@link Ball#moveBall()} method
     * to make the game be played.
     */
	public void Window() throws InterruptedException {
		// Creates a JFrame
		JFrame jf = new JFrame("GAME");
		// Creates a GraphicPanel
		GraphicPanel gp = new GraphicPanel();
		// Creates a Ball
		Ball ball= new Ball();
		
		jf.setBounds(0, 0, dimensionX, dimensionY);
		jf.setBackground(Color.BLUE);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gp.setBackground(Color.BLUE);
		jf.add(gp);
		for (int i = 0; i <= 2; i++) {
			Thread.sleep(1000);
			gp.repaint();
		}
		game_start = false;
		do {
			ball.moveBall();
			gp.repaint();
			Thread.sleep(5);
		} while (Ball.coordY + Ball.height / 2 < dimensionY);
		game_over = true;
		Thread.sleep(750);
		gp.repaint();
	}
}
