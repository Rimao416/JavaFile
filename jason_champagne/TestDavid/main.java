public class main {
    public static void main(String[] args) {
        ouvrier o1=new ouvrier(1900);
        o1.SetNom("DAVID");
        o1.SetPrenom("JUNIOR");
        o1.Affiche();

        president p1=new president("BON");
        p1.SetNom("Omari");
        p1.SetPrenom("Omari");
        p1.Affiche();

        cadre c1=new cadre(1);
        c1.SetNom("AZE");
        c1.SetPrenom("RTY");
        c1.Affiche();

        cadre c2=new cadre(2);
        c2.SetNom("AZETY");
        c2.SetPrenom("RTVHBJKLY");


        p1.Afficher(c1);
        p1.Afficher(c2);
    }
}
