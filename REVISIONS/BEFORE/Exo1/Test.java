public class Test {
    public static void main(String[] args) {
        Point P1=new Point();
        Point P2=new Point(4,5);
        P1.toString();
        P2.toString();
        P1.Affiche();
        P2.Affiche();
        P1.SetX(180);
        P2.SetY(150);
        P1.Affiche();
        P2.Affiche();
        P1.Distance(P2);
    }
}
