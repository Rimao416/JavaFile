package Seance3;

public class Enfant extends Papa {
	int y;
	
public Enfant()
{
	super();
	 y = 3;
}

public Enfant (int x, int y)
{
	super(x);
	this.y = y;
}

public Enfant (int y)
{
	this(1,y) ;// super(1); this.y = 1;
}

public int calcul (int a)
{
	return (x*y*a);
}
public String toString()
{
	return "x = "+ this.x+", y = "+this.y;
}

public int calcul_enfant(int a)
{
	return (super.calcul(a));//utilise la m?thode du p?re 2*5
}

}
