abstract class Forme{
    Point centre;
    abstract double perimetre();
    abstract double surface();
    abstract void affiche();
    public Forme(Point P){
        centre=P;
    }
    /*public void deplacer(double x, double y){
        centre.deplacer(x,y);
    }*/

}