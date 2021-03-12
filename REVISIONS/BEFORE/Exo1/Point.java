import java.lang.Math;
public class Point{
    private double x,y;
    public Point(){
        x=0;
        y=0;
    }
    public Point(double x, double y){
        this.x=x;
        this.y=y;
    }
    public void SetX(double x){
        this.x=x;
    }
    public void SetY(double y){
        this.y=y;
    }
    public double GetX(){
        return this.x;
    }
    public double GetY(){
        return this.y;
    }
    public String toString(){
        return ("X ="+this.x+" Y ="+this.y);
    }
    public void Affiche(){
        System.out.println(toString());
    }
    public void Distance(Point P){
        System.out.println("La distance entre le point de coordonné X="+this.x+" et Y= "+this.y+" et le coordonné X="+P.x +" Y= "+P.y+" = "+Math.sqrt(Math.pow(this.y-this.x,2)+Math.pow(P.y-P.x,2)));
        System.out.println("La distance entre le point de coordonné X="+this.x+" et Y= "+this.y);
    }
    public void deplace(double x,double y){
        this.x+=x;
        this.y=y;
    }

}
