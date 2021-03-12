abstract class Employe {
    private String nom, prenom;
    private int age, date;
    abstract double calculerSalaire();
    public Employe(){
        this.nom="";
        this.prenom="";
    }
    public Employe(String nom, String prenom){
        this.nom=nom;
        this.prenom=prenom;
    }
    public String GetNom(){
        return this+nom+" "+this.prenom;
    }
}
