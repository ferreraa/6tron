package model;

import java.awt.Point;

public class Champion {

	private Color color;		//Couleur utilisée par le champion

	private int angle;			//angle définissant le vecteur directeur du champion.   Unitée : degrés
	private int speed;			//vitesse du champion, variant entre 0 et 10
	private Point position;		//Position du champion sur la map
	
	public Champion(Color color) {
		this.color = color;
		speed = 5;
		position = null;
	}
	
	/**
	 * the champion spawns one the given position
	 * @param pos position on the grid
	 * @param angle defines the direction of the champion
	 */
	public void spawn(Point pos, int angle)
	{
		position = pos;
		this.angle = angle;
	}

	
	public void rotate_left()
	{
		angle+=10;
	}
	
	public void rotate_right()
	{	
		angle-=10;
	}
}
