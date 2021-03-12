import java.util.*;
import java.util.regex.Pattern;

public class dossierpharmacie {
    private String nom;
    private HashMap<String,patient>patients;
    public dossierpharmacie(String n){
        this.nom=n;
        patients=new HashMap<>();
    }
    public void nouveauPatient(String nom, String [] ord){
        patient p =new patient(nom);
        for(String n:ord){
            p.ajoutMedicament(n);
        }
        patients.put(p.getName(),p);
    }
}
