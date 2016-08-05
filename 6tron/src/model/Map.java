package model;

public class Map {

	private Cell grid [][];     //grille qui représente la carte de jeu.
	
	public Map(int width, int height) {
		grid = new Cell [width][height];   //[absciss][ordinate]
	}

	public int getHeight()
	{	
		if(grid.length==0) return 0;
		else return grid[0].length;
	}
	
	public int getWidth()
	{	return grid.length;	}
	
	
	public void setNewBonus(Bonus bonus) 
	{
		//TODO faire un parcours en forme de carré ou cercle (suivant la forme voulue) pour que les cellules comportent le nouveau bonus.
	}

	public Cell getCell(int x, int y)
	{
		if(x>=getWidth() || y>=getHeight())  return null;
		else  return grid[x][y];
	}
}
