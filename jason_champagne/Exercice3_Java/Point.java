public class Point{
    private double x,y;
    public Point(){
        this.x=0;
        this.y=0;
    }
    public Point(double x, double y){
        this.x=x;
        this.y=y;
    }
    public String toString(){
        return "x ="+x+" y="+y;
    }
    public void Affiche(){
        System.out.println(toString());
    }
    public void SetXY(double x, double y){
        this.x=x;
        this.y=y;
    }

}