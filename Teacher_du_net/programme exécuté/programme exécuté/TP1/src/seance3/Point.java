package seance3;



public class Point {

	public double x;
	public double y;
	
public Point()
{
	x = 0.0;
	y = 0.0;
}

public Point(double a , double b)
{
	x = a;
	y = b;
}

public String toString()
{
	return " ( x = "+ x +" ,  y = " + y + ") ";
	
}
public void affiche()
{
	System.out.println(toString());
}

public  double getX()
{
	return x;
}

public double getY()
{
	return y;
}

public void setX (int a)
{
	x = a;
}
public void setY (int b)
{
	y = b ;
}

public double distance(Point P)
{
	return Math.sqrt(Math.pow((x - P.getX()), 2) + Math.pow((y - P.y) , 2));
}

public void deplacer(double dx, double dy)
{
	x = x+dx;
	y = y+dy;
}

public void finalize()
{
	System.out.println("un objet est supprimé");
}

public Boolean equals (Point P)
{
	return (( x == P.x ) && (y == P.y));
}

}
