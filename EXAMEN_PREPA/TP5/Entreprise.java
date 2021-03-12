import java.util.*;
public class Entreprise {
    private String nom;
    private ArrayList<Employe>lesEmployes;
    public Entreprise(String nom){
        this.nom=nom;
        lesEmployes=new ArrayList<>();
    }
    public String getNom(){
        return this.nom;
    }
    public void SetNom(String nom){
        this.nom=nom;
    }
/*    public void setEntreprise(Entreprise E){
        for(Employe Emp:lesEmployes){
            if(Emp.getNom().equals(E.lesEm)
        }
    }*/
    public boolean aPourEmploye(Employe Emp){
        return (this.lesEmployes.contains(Emp));
    }
    public void Engager(Employe Emp){

    }
    public void seSeparerDe(Employe Emp){

    }
}
