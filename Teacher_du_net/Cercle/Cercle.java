
public abstract class Forme {​​​​​​​


    double rayon;
    static int compteur ;
    
public Cercle(double rayon,Point P)
{
    super(P);
    this.rayon = rayon;
    compteur = compteur + 1;
}
public Cercle ()
{
    super(new Point());
    this.rayon = 0;
    compteur ++;
    
}
public String toString()
{    
    return "Le cercle est de rayon :"+rayon+"a pour centre: "+centre.toString();
    
}
public void affiche(){
    
    
    System.out.println(toString());

 

}
double perimetre()
{
    return(2* Math.PI *rayon);
    
}

 

double surface()
{
    
    return (Math.PI * rayon * rayon);
    
}
void test(Cercle c){
    double d2=this.centre.distance(c.centre);
    double d2=this.rayon+c.rayon;
}
    
    }​​​​​​​

