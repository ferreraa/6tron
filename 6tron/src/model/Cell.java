package model;

import java.util.ArrayList;

public class Cell {

	private Color color;     //Couleur de la case si elle a été marquée. vaudra null si personne n'a marqué cette case
	private ArrayList<Bonus> bonus_list;   //liste des bonus associés à cette case

	
	public Cell() {
		color = null;
		bonus_list = new ArrayList<Bonus>();
	}

	public Color getColor() 
	{ return color; }

	public void addBonus(Bonus bonus)
	{	bonus_list.add(bonus);	}
	
	public ArrayList<Bonus> getBonus()
	{	return bonus_list;	}
	
	public boolean isColored()
	{ 	return color==null;	}
	
	
}
