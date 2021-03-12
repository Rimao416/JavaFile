import java. lang. Math. *;

public class Cercle extends Forme {
    private double rayon;
    private static int compteur;
    private Point P;
    public Cercle(Point P, double rayon){
        super(new Point(2,3));
        this.compteur++;   
        this.rayon=rayon;
    }
    public void affiche(){
        System.out.println(centre.toString()+" et le rayon vaut "+this.rayon);
        System.out.println(P.toString()+" et le rayon vaut "+this.rayon);
        System.out.println(toString()+" et le rayon vaut "+this.rayon);


    }
    public double perimetre(){
        return(2 * Math.PI * rayon);
    }
    public double surface(){
        return (Math.PI * rayon * rayon);
    }

}
