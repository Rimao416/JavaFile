package TP2;

import seance1.Point;
public class Rectangle extends Forme {
	
	private double longueur, largeur;
	public Rectangle(Point p,double longueur,double largeur)
	{
		super(p) ;
		this.longueur=longueur;
		this.largeur=largeur;
	}
	double perimetre()
	{
		return(2*(longueur+largeur));
	}
	double surface()
	{
		return longueur*largeur;
	}
	
	public String toString()
	{
		return "Le rectangle de longueur:" + longueur + "et de largeur" + largeur;
	}
	
	
	@Override
	public int compareTo(Object arg0) {
		// TODO Auto-generated method stub
		return 0;
	}
}
