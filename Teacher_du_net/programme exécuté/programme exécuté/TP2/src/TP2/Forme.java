package TP2;
import TP2.Point;
public abstract class Forme implements Comparable {

		Point centre;
		abstract double perimetre();
		abstract double surface();
		abstract void   affiche();
	
	public Forme(Point P)

	{
		centre = P;
	}
	
		public void deplacer(int x, int y)
	{
		centre.deplacer(x,y);
	}
	
	
	}
	


