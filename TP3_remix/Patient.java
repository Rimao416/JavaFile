import java.util.Set;
import java.util.TreeSet;
public class Patient {
    private String nom;
    private Set<String> ordonnance;
    public Patient(){
        this.nom="";
    }
    public Patient(String nom){
        this.nom=nom;
        ordonnance=new TreeSet<String>();
    }
    public String getNom(){
        return this.nom;
    }
    public void setNom(String nom){
        this.nom=nom;
    }
    public Set<String> getOrdonnance(){
        return ordonnance;
    }

    public String toString(){
        return "Patient [Nom="+nom+", ordonnace ="+ordonnance+"]";
    }
    public void affiche(){
        System.out.println(toString());
    }
    public void ajoutMedicament(String m){
        ordonnance.add(m);
    }
    public void afficheOrdonnance(){
        System.out.println(ordonnance);
    }
    public boolean contientMedicament(String m){
        return ordonnance.contains(m);
    }
    public boolean ordonnanceVide(){
        return ordonnance.isEmpty();
    }     
}
