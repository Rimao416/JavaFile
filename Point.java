    public class Point {
        public double x;
        public double y;
        
        
        public Point()
        {
            x=0;
            y=0;
        }
        public Point (double a , double b)
        {
            x=a;
            y=b;
        }
        

        public String toString()
        {
            return " ( x = "+ x +" ,  y = " + y + ") ";
        }
        public void affiche(){
            System.out.println(toString());
        }
        //Calcul de la distance entre deux points
        public double distance(Point P){
            return Math.sqrt(Math.pow((x - P.y),2)+Math.pow((y-P.y),2));//Calculer la distance de P2 par rapport à P4
        }
        /*
        public Boolean equals (Point P)
        {
            return (( x == P.x ) && (y == P.y));
        }
     */   
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
    }    
