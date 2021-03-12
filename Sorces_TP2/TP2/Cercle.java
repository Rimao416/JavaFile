package TP2;

import seance1.Point;

public class Cercle extends Forme{
	
	private double rayon;
	static int Compteur;
    
	public Cercle (Point P, double rayon )
	{
		super(P);
		this.rayon = rayon;
		Compteur ++;
	}
	
	public Cercle()
	{
		super(new Point(2,3));
		this.rayon = 0;
		Compteur++;
	}
	
	public String toString()
	{
		return "le Cercle est de rayon "+ rayon +"a pour centre " + centre.toString();
	}
	
	
	double perimetre()
	{
		return(2 * Math.PI * rayon);
	}
	double surface()
	{
		return (Math.PI * rayon * rayon);
	}
	
	void test (Cercle c)
	{
		double d1 = (this.centre).distance(c.centre);
		double d2 = this.rayon + c.rayon;
		if(d1 > d2)
		{
			System.out.println("les deux cercles ont une intersection vide");
		}
		else
		{
			if(d1 == d2)
			{
				System.out.println("les deux cercles sont tangents");
			}
			else
			{
				System.out.println("les deux cercles sont sécants");
			}
		}
	}
	public void finalize()
	{
		System.out.println("un cercle est supprimé");
		Compteur--;
	}

	@Override
	public int compareTo(Object arg0) {
		// TODO Auto-generated method stub
		if ( this.surface() > ((Cercle)arg0).surface() )
		{
			return 1;
		}
		else
		{
			if( this.surface() == ((Cercle)arg0).surface())
			{
				return 0;
			}
			else
			{
				return -1;
			}
		}
	}
}
