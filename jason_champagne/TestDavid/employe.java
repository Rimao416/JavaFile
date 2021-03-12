abstract class employe{
    private String nom, postNom;
    abstract double CalculSalaire();

    public employe(){
        this.nom="";
        this.postNom="";
    }
    public employe(String nom, String postNom){
        this.nom=nom;
        this.postNom=postNom;
    }
    public String getNom(){
        return nom;
    }
    public String getPNom(){
        return postNom;
    }
    public void SetNom(String Nom){
        this.nom=Nom;
    }
    public void SetPrenom(String Post){
        this.postNom=Post;
    }
    public String toString(){
        return this.nom+" "+this.postNom+" a un salaire de "+this.CalculSalaire();
    }
    public void Affiche(){
        System.out.println(toString());
    }
}