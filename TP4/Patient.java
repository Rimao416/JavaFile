import java.util.Set;
import java.util.TreeSet;

public class Patient{
    private String nom;
    private Set<String> ordonnance;
    public Patient(String nom){
        this.nom=nom;
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
        return ordonnance.contains(m)
    }
    public boolean ordonnanceVide(){
        return ordonnance.isEmpty();
    }
    
}