import java.util.Map;
import java.util.TreeMap;
public class DossierPharmacie {
    private String nom;
    private Map<String, Patient>les_patients;
    public DossierPharmacie(String nom){
        this.nom=nom;
        les_patients=new TreeMap<String, Patient>();
    }
    public void nouveauPatient(String nom, String [] ord){
        Patient P=new Patient();
        les_patients.put(nom,P);
        for(String n:ord){
            P.ajoutMedicament(n);
        }
    }
    public boolean ajoutMedicament(String nom, String m){
        boolean exist=false;
        if(les_patients.containsKey(nom)==true){
            exist=true;
            Patient patient_chercher=les_patients.get(nom);
            patient_chercher.ajoutMedicament(m);
            
        }
        return exist;
    }
    public String toString(){
        return "Dossier Pharmacie [nom="+nom+"les patients ="+les_patients+"]";
    }
    public void AfficherPatient(String nom){
        if(les_patients.containsKey(nom)==true){
            (les_patients.get(nom)).affiche();
        }
    }
    public void affiche(){
        System.out.println(toString());
    }
}
