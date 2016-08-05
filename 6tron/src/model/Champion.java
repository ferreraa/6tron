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
		angle = (angle+10)%360;
	}
	
	public void rotate_right()
	{	
		angle = (angle-10)%360;
	}
	
	public Point getHeadingVector()
	{
		Point vector = new Point();
		vector.x = (int) Math.cos(Math.PI*angle/180);
		vector.y = (int) Math.sin(Math.PI*angle/180);
		return vector;
	}

	public int getSpeed()
	{
		return speed;
	}
	
	public Point getPosition()
	{
		return position;
	}
	
	public Color getColor()
	{
		return color;
	}
	
	public void move()
	{
		//TODO voir comment on gere les déplacements (vitesse, collisions, hitbox toussa toussa)
	}
}
