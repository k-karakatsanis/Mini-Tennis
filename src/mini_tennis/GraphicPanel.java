/*
 * GraphicPanel
 * 
 * $Id$
 * 
 * Copyright 2014 konkara@dmst.aueb.gr
 */
package mini_tennis;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 * It's responsible for the graphics of the game.
 * 
 * @version 1.00 January 2014
 * @author Konstantinos Karakatsanis
 */
public class GraphicPanel extends JPanel {
	
	/**
	 * A counter.
	 * It is used to make the loading image
	 * seems like moving
	 */
	private static int i = 0;
	
	// Creates a Ball
	Ball ball= new Ball();
	
	// Creates a Rectangle
	Rectangle rectangle = new Rectangle();
	
	// Creates a MyKeyListener
	MyKeyListener myKeyListener = new MyKeyListener();
	
	/** Serial number of persistent  data. */
	private static final long serialVersionUID = 1L;
	
	/**
	 * GraphicPanel's constructor
	 * It adds a KeyListener
	 * to the graphic panel
	 */
	public GraphicPanel() {
		addKeyListener(myKeyListener);
		setFocusable(true);
	}
	
	/**
     * Draws the game's graphics
     * 
     * @param g The Graphics object on which we will paint
     */
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		if (Panel.game_over == false) {
			if (Panel.game_start) {
				if (i == 0){
					i++;
					g.setFont(new Font(Font.SANS_SERIF, Font.ITALIC, 60));
					g.setColor(Color.GREEN);
			        g.drawString("LOADING.  ", 650, 400);
				}
				else if (i == 1) {
			        i++;
					g.setFont(new Font(Font.SANS_SERIF, Font.ITALIC, 60));
					g.setColor(Color.GREEN);
			        g.drawString("LOADING.. ", 650, 400);
				}
				else if (i == 2) {
					i++;
					g.setFont(new Font(Font.SANS_SERIF, Font.ITALIC, 60));
					g.setColor(Color.GREEN);
			        g.drawString("LOADING...", 650, 400);
				}
			}
			else {
				ball.paint(g);
				rectangle.paint(g);
				g.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 20));
				g.setColor(Color.GREEN);
		        g.drawString("" + Ball.points + "", 50, 50);
			}
		}
		else {
			g.setFont(new Font(Font.SANS_SERIF, Font.ITALIC, 60));
			g.setColor(Color.GREEN);
	        g.drawString("GAME OVER", 600, 400);
	        g.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 45));
			g.setColor(Color.GREEN);
	        g.drawString(Ball.points + " POINTS", 675, 500);
		}
	 }
}
