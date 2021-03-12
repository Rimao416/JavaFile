public class rectangle extends Forme{

private double longueur, largeur;
    public rectangle(Point p,double longueur,double largeur)
        {
            super(p) ;
            this.longueur=longueur;
            this.largeur=largeur;
        }
    double perimetre()
        {
            return(2*(longueur+largeur));
        }
    double surface()
        {
            return longueur*largeur;
        }
    public String toString()
    {
        return "Le rectangle de longueur:"+ longueur + "et de largeur" + largeur;
    }
    public void affiche()
    {

        System.out.println(toString());
    }

}
