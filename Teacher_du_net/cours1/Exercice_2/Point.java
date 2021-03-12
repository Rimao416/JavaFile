package cours1.Exercice_2;

public class Point {
    int x;
    int y;
    
    
    public Point()
    {
        x=0;
        y=0;
    }
    public Point (int a , int b)
    {
        x=a;
        y=b;
    }
/*    
    public String toString()
    {
        return " ( x = "+ x +" ,  y = " + y + ") ";
    }
  */  
/*     public Boolean equals (Point P)
    {
        return (( x == P.x ) && (y == P.y));
    }
 */   
    public void translater (int dx , int dy)
    {
        x=x+dx;
        y=y+dy;
    }
    
    public double Distance(Point P){
        return Math.sqrt(Math.pow((x-P.x),2)+Math.pow((y-P.y),2));
    }


}
