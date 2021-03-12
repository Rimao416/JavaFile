import java.util.*;
abstract public class collaborateur implements ICollaborateur {
    private int matricule;
    private String nom;
    private double coutJournalier;
    public abstract double CalculCoutProjet(int n);
    public collaborateur(){
        this.nom="";
        this.coutJournalier=0;
    }
    public collaborateur(int matricule,String nom, double coutJourn){
        this.matricule=matricule;
        this.nom=nom;
        this.coutJournalier=coutJourn;
    }
    public String GetNom(){
        return this.nom;
    }
    public int GetMatr(){
        return this.matricule;
    }
    public double GetCout(){
        return this.coutJournalier;
    }
    public void setNom(String Nom){
        this.nom=Nom;
    }
    public void setCout(double cout){
        this.coutJournalier=cout;
    }
    public void setMatr(int Matr){
        this.matricule=Matr;
    }
    public boolean moinsCher(collaborateur c, int n){
        
        return (this.coutJournalier > c.GetCout());
    }
    public boolean equals(Object obj){
        return (this.matricule==((collaborateur)obj).matricule);
    }
    public String toString(){
        return "Collaborateur [matricule"+matricule+" nom "+nom+"  count journalier "+coutJournalier;
    }
    public void Afficher(){
        System.out.println(toString());
    }
}
