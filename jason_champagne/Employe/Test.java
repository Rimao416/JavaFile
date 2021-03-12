public class Test {
    public static void main(String[] args) {
        Ouvrier o=new Ouvrier(1980);
        o.SetEmploye("Omari", "Kayumba", 1230, 1980);
        o.Affiche();
        Ouvrier p=new Ouvrier(2000);

        Cadre c=new Cadre(4);
        c.SetEmploye("Dido","Kayumba",1500,2000);
        c.Affiche();
        Patron a=new Patron(2600,30);
        a.SetEmploye("Dido","Kayumba",1500,2000);
        a.Affiche();

    }
}
