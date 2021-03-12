package TP2;

import seance1.Point;

public abstract class Forme implements Comparable{

	Point centre;

	public Forme(Point p) {
		centre = p;
	}

	public void deplacer(int x, int y) {
		centre.deplacer(x, y);
	}

	abstract double perimetre();

	abstract double surface();

	void affiche()
	{
		System.out.println(toString());
	}
}
