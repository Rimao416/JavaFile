abstract class Employe{
    private String Matricule, Nom, Prenom, DateDeNaissance;
    public abstract double GetSalaire();
    public Employe(){
        this.Matricule="";
        this.Nom="";
        this.Prenom="";
        this.DateDeNaissance="";
    }
    public Employe(String Mat, String Nom, String Prenom, String Date){
        this.Matricule=Mat;
        this.Nom=Nom;
        this.Prenom=Prenom;
        this.DateDeNaissance=Date;
    }
    public String GetMatricule(){
        return this.Matricule;
    }
    public String GetNom(){
        return this.Nom;
    }
    public String GetPrenom(){
        return this.Prenom;
    }
    public String GetDateDeNaissance(){
        return this.DateDeNaissance;
    }
    public void SetMatricule(String Mat){
        this.Matricule=Mat;
    }
    public void SetNom(String Nom){
        this.Nom=Nom;
    }
    public void SetPrenom(String Prenom){
        this.Prenom=Prenom;
    }
    public void SetDateDeNaissance(String Date){
        this.DateDeNaissance=Date;
    }
    public String toString(){
        return "Matricule "+this.Matricule+" \n "+" Nom "+this.Nom+" \n "+" Prenom "+this.Prenom+" \n "+" date "+this.DateDeNaissance;
    }
    public void Affiche(){
        System.out.println(toString());
    }
}