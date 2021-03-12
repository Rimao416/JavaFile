//Creation de la classe Eleve
public class Eleve{
    private int identifiant;
    private String nom;
    private String prenom;
    public Eleve(int identifiant, String nom, String prenom){
        this.identifiant=identifiant;
        this.nom=nom;
        this.prenom=prenom;
    }
    public int getIdentifiant(){
        return identifiant;
    }
    public void setIdentifiant(int identifiant){
        this.identifiant=identifiant;
    }
    public String getNom(){
        return nom;
    }
    public void setNom(String nom){
        this.nom=nom;
    }
    public String getPrenom(){
        return prenom;
    }
    public void setPrenom(String prenom){
        this.prenom=prenom;
    }
    public boolean equals(Eleve e){
        return this.identifiant==e.identifiant && this.nom==e.nom && this.prenom==e.prenom;
    }
    public void Affiche(){
        System.out.println(this.identifiant+" "+this.nom+" "+this.prenom);
    }

}