/*
 * Rectangle
 * 
 * $Id$
 * 
 * Copyright 2014 konkara@dmst.aueb.gr
 */
package mini_tennis;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import javax.swing.JPanel;

/**
 * The rectangle's class.
 * It's responsible for the rectangle's
 * movement and drawing.
 * 
 * @version 1.00 January 2014
 * @author Konstantinos Karakatsanis
 */
public class Rectangle extends JPanel {
	
	/** The rectangle's width. */
	protected final static int width = 100;
	
	/** The rectangle's height. */
	protected final static int height = 30;
	
	/** The rectangle's 'x' current coordinate. */
	protected static int coordX = Panel.dimensionX / 2;
	
	/** The rectangle's 'y' current coordinate. */
	protected static int coordY = Panel.dimensionY - height / 2;
	
	/** Serial number of persistent  data. */
	private static final long serialVersionUID = 1L;
	
	/**
     * Makes the rectangle moving.
     * It moves the rectangle left or right
	 * according to the button that was pressed
	 * by the user.
	 * 
	 * @param e the pressed button
     */
	public void moveRectangle(KeyEvent e) {
		if ((e.getKeyCode() == KeyEvent.VK_RIGHT)
				&& (coordX + width / 2 <= Panel.dimensionX))
			coordX = coordX + 20 * (Ball.speed);
		else if ((e.getKeyCode() == KeyEvent.VK_LEFT)
				&& (coordX - width / 2 >= 0))
			coordX = coordX - 20 * (Ball.speed);
	}
		
	/**
     * Draws the rectangle.
     * 
     * @param g The Graphics object on which we will paint
     */
	@Override
	public void paint(Graphics g) {
		g.setColor(Color.GREEN);
		g.fillRect(Rectangle.coordX - Rectangle.width / 2,
				Rectangle.coordY - Rectangle.height,
				Rectangle.width, Rectangle.height);
	}
}
