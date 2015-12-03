/*
 * MiniTennis
 * 
 * $Id$
 * 
 * Copyright 2014 konkara@dmst.aueb.gr
 */
package mini_tennis;

/**
 * The Mini Tennis' program main class.
 * 
 * @depend - - - mini_tennis.Panel
 * @depend - - - mini_tennis.Ball
 * @depend - - - mini_tennis.Rectangle
 * @depend - - - mini_tennis.GraphicPanel
 * @depend - - - mini_tennis.MyKeyListener
 * 
 * @version 1.00 January 2014
 * @author Konstantinos Karakatsanis
 */
public class MiniTennis {

	public static void main(String[] args) throws InterruptedException {
		Panel panel = new Panel();
		panel.Window();
	}
}
