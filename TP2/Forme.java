abstract class Forme
{
    Point centre;
    abstract double perimetre();
    abstract double surface();
    abstract void affiche();
        public Forme(Point p)
        {
        centre = p;
        }
        public void deplacer(int x, int y)
        {
        centre.deplacer(x,y);
        }
}


