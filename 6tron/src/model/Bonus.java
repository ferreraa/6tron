package model;

import java.awt.Point;

public abstract class Bonus {

	protected int ray;
	protected Point center;
	
	public Bonus(int ray, Point center) {
		this.ray = ray;
		this.center = center;
	}

	public int getRay()
	{	return ray;	}
	
	public Point getCenter()
	{	return center;	}
}
