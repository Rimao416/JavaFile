public abstract class Employe{
    private String nom;
    public Employe(String nom){
        this.nom=nom;
    }
    public abstract double getSalaire();
    public String getNom(){
        return this.nom;
    }
}