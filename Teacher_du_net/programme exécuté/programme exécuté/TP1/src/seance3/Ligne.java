package seance3;

public class Ligne {
private int nb_segments;
protected Segment les_segments[];


public Ligne (int n)
{
	nb_segments = n;
	les_segments = new Segment[n];
}

public double longueur()
{
	double l  = 0;
	for(int i = 0; i < les_segments.length - 1;i++)
	{
		l = l + les_segments[i].longueur();
	}
 
		
	return l;
}

public boolean appartient (Point P)
{
	boolean app = false;
	for(int i = 0; i < les_segments.length - 1 ;)
	{
		if(les_segments[i].appartient(P) == true)
		{
			app = true;
		}
	}
	return app;
}
public void polygone()
{
	if(les_segments[0].getextr1().equals(les_segments[les_segments.length -1].getextr2()))
	{
		System.out.println("la ligne est un polygone");
		
	}
	else
	{
		System.out.println("la ligne n'est pas un polygone");
	}
}












}
