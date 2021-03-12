abstract class Employe{
    private String Prenom, nom;
    private int matricule, Date;
    public abstract double GetSalaire();

    public Employe(){
        this.Prenom="";
        this.nom="";
        this.matricule=0;
        this.Date=0;
    }
    public Employe(String Prenom, String nom, int matricule, int Date){
        this.Prenom=Prenom;
        this.nom=nom;
        this.matricule=matricule;
        this.Date=Date;
    }
    public void SetEmploye(String Prenom, String nom, int matricule, int Date){
        this.Prenom=Prenom;
        this.nom=nom;
        this.matricule=matricule;
        this.Date=Date;
    }
    public String GetPrenom(){
        return this.Prenom;
    }
    public String GetNom(){
        return this.nom;
    }
    public int GetMatr(){
        return this.matricule;
    }
    public int GetDate(){
        return this.Date;
    }
    public void SetPrenom(String prenom){
        this.Prenom=prenom;
    }
    public void Setnom(String nom){
        this.nom=nom;
    }
    public void SetMatr(int mat){
        this.matricule=mat;
    }
    public void SetDate(int Date){
        this.Date=Date;
    }
    public String toString(){
        return "L'employé "+this.Prenom+" "+this.nom+" est de matricule "+this.matricule+" est present ça fait "+(2020-this.Date)+" ans et a un salaire de "+GetSalaire();
    }
    public void Affiche(){
        System.out.println(toString());
    }
}