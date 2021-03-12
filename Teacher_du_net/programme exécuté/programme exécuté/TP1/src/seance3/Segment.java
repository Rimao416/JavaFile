package seance3;

public class Segment {
	
	public Point extr1;
	public Point extr2;
	
public Segment(Point P , Point Q)
{
	extr1 = P;
	extr2 = Q;
}
public Segment(double x1, double y1, double x2, double y2)
{
	extr1 = new Point(x1 , y1);
	extr2 = new Point(x2 , y2);
	
}

public Segment ()
{
	extr1 = new Point();
	extr2 = new Point();
}
public double longueur()
{
	return extr1.distance(extr2);
}

public void affiche()
{
	System.out.println("extr1 : "+extr1.toString());
	System.out.println("extr2 : "+extr2.toString());
}

public Point getextr1()
{
return extr1;
}

public Point getextr2()
{
return extr2;
}

public void setExtr1(Point P)
{
	extr1 = P;
}

public void setExtr2(Point P)
{
	extr2 = P;
}

public boolean appartient (Point P)
{
	double d1 = extr1.distance(P);
	double d2 = extr2.distance(P);
	if((d1 + d2) == longueur())
	{
		return true;
	}
	else
	{
		return false;
	}
}
}


