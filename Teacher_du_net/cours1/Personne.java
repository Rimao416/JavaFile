package cours1;

public class Personne {
    public String nom;
    public String prenom;
    public int age;
    static int nombreTotalDePersonnes;
     
    public Personne(String nom,String prenom){
        this.nom=nom;
        this.prenom=prenom;
     nombreTotalDePersonnes++;
    }
    public String getNom(Strin Nom){
        this.nom=Nom;
    }

    public String getPreNom(Strin preNom){
        this.prenom=preNom;
    }
   public String full_title(String Debut){
       return Debut+" "+this.nom+" "+this.prenom;
   } 

}
