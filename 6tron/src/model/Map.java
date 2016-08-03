package model;

public class Map {

	private Cell grid [][];     //grille qui représente la carte de jeu.
	
	public Map(int lines, int columns) {
		grid = new Cell [lines][columns];
	}

	public int getHeight()
	{	return grid.length;	}
	
	public int getWidth()
	{	return grid[0].length;	}
	
	
	public void setNewBonus(Bonus bonus) 
	{
		//TODO faire un parcours en forme de carré ou cercle (suivant la forme voulue) pour que les cellules comportent le nouveau bonus.
	}
	
}
