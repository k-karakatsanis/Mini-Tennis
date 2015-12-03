/*
 * Ball
 * 
 * $Id$
 * 
 * Copyright 2014 konkara@dmst.aueb.gr
 */
package mini_tennis;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 * The ball's class.
 * It's responsible for the ball's
 * movement and drawing.
 * 
 * @version 1.00 January 2014
 * @author Konstantinos Karakatsanis
 */
public class Ball extends JPanel {
	
	/** The ball's width. */
	protected final static int width = 20;
	
	/** The ball's height. */
	protected final static int height = 20;
	
	/** The ball's 'x' current coordinate. */
	protected static int coordX = Panel.dimensionX / 2;
	
	/** The ball's 'y' current coordinate. */
	protected static int coordY = height / 2;
	
	/** The ball's speed. */
	protected static int speed = 1;
	
	/** The total points. */
	protected static int points = 0;
	
	/** Shows if the ball is moving right. */
	private boolean right = true;
	
	/** Shows if the ball is moving down. */
	private boolean down = true;
	
	/** Serial number of persistent  data. */
	private static final long serialVersionUID = 1L;
	
	/**
     * Makes the ball moving.
     */
	public void moveBall() {
		if (right) {
			coordX = coordX + speed + 1;
			if (coordX + width / 2 >= Panel.dimensionX)
				right = false;
		}
		else {
			coordX = coordX - speed - 1;
			if (coordX - width / 2 <= 0)
				right = true;
		}
		if (down) {
			coordY = coordY + speed;
			if ((coordY + height / 2 == Rectangle.coordY)
					&& (coordX <= Rectangle.coordX + Rectangle.width / 2)
					&& (coordX >= Rectangle.coordX - Rectangle.width / 2)) {
				down = false;
				points = points + 10;
			}
		}
		else {
			coordY = coordY - speed;
			if (coordY - height / 2 <= 0)
				down = true;
		}
	}
	
	/**
     * Draws the ball.
     * 
     * @param g The Graphics object on which we will paint
     */
	@Override
	public void paint(Graphics g) {
		g.setColor(Color.GREEN);
		g.fillOval(Ball.coordX - Ball.width / 2,
				Ball.coordY - Ball.height / 2,
				Ball.width, Ball.height);
	}
}
