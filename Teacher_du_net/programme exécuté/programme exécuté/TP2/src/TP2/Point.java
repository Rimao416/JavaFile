package TP2;


public class Point {
	private int x;
	private int y;
	
	public Point()
	{
		x=0;
		y=0;
	}
	public Point (int x , int y)
	{
		this.x=x;
		this.y=y;
	}
	
	public String toString()
	{
		return " ( x = "+ x +" ,  y = " + y + ") ";
	}
	
	public Boolean equals (Point P)
	{
		return (( x == P.x ) && (y == P.y));
	}
	
	public void translater (int dx , int dy)
	{
		x=x+dx;
		y=y+dy;
	}
	
	public void  somme (Point P, Point p)
	{
		x = P.x + p.x;
		y = P.y + p.y;
	}
	
	/*public void finalize()
	{
		System.out.println("un objet est supprimé");
	}*/
	
	public int getX()
	{
		return x;
	}
	
	public int getY()
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
	public void affichage()
	{
		System.out.println(this.toString());
	}
	public void deplacer(int dx, int dy)
	{
		x = x+dx;
		y = y+dy;
	}
	public double distance(Point P)
	{
		return Math.sqrt(Math.pow((x - P.getX()), 2) + Math.pow((y - P.y) , 2));
	}


}
