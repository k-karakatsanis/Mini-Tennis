/*
 * MyKeyListener
 * 
 * $Id$
 * 
 * Copyright 2014 konkara@dmst.aueb.gr
 */
package mini_tennis;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * Understands the user's commands.
 * 
 * @version 1.00 January 2014
 * @author Konstantinos Karakatsanis
 */
public class MyKeyListener implements KeyListener {
	
	// Create a Rectangle
	Rectangle rectangle = new Rectangle();
	
	/**
     * Executes the {@link Rectangle#moveRectangle(KeyEvent)} method,
     * when a button is pressed by the user,
     * to move the rectangle, if it is needed.
     */
	@Override
	public void keyPressed(KeyEvent e) {
		rectangle.moveRectangle(e);				
	}
	
	/**
     * No action is done.
     */
	@Override
	public void keyReleased(KeyEvent e) {	
	}
	
	/**
     * No action is done.
     */
	@Override
	public void keyTyped(KeyEvent e) {
	}
}
