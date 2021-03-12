import java.util.*;
public class test {
    public static void main(String[] args) {
        DossierPharmacie DS1=new DossierPharmacie("Pharmacie_UIT");
        String Ord1[]={"Doliprane 500","Vitamine C","Augemntin 500"};
        String Ord2[]={"Algesic extra","Panadol"};
        String Ord3[]={"Doliprane 500","Vitamine C","Fervex"};
        DS1.nouveauPatient("Ali",Ord1);
        DS1.nouveauPatient("Sami",Ord2);
        DS1.affiche();

        System.out.println(DS1.ajoutMedicament("Ali","Panadol"));
        DS1.AfficherPatient("Ali");
    }
}
