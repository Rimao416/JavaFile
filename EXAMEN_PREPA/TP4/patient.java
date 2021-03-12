import java.util.*;
import java.util.regex.Pattern;
public class patient{
    private String nom;
    private TreeSet<String>Ordonnance;
    public patient(String n){
        this.nom=n;
        Ordonnance=new TreeSet<>();
    }
    public String getName(){
        return this.nom;
    }
    public void SetName(String n){
        this.nom=n;
    }
    public void ajoutMedicament ( String m ) {
        Ordonnance.add ( m );
        }
    public void AfficheMedicament(String m){
        Ordonnance.add(m);
    }
    public void AfficheOrdonnance(){
        System.out.println(Ordonnance);
    }
    public boolean contientMedicament(String m){
        return Ordonnance.contains(m);
    }
    public boolean Ordonnancevide(){
        return Ordonnance.isEmpty();
    }

}