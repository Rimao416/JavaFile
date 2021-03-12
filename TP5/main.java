import java.util.*;
public class main {
    public static void main(String[] args) {
        Serviceinfo Sinfo1 = new Serviceinfo();
SalarieEntreprise SE1 = new SalarieEntreprise(22,"Ben Salah" , 60 , "Concepteur");
SalarieEntreprise SE2 = new SalarieEntreprise(33,"Ben Salah" , 50 , "Developpeur");
collaborateur C1 = new consultant(1 , "Ben mrad", 50 , 100);
collaborateur C2 = new consultant(2 , "Ben Ahmed", 20 , 100);
collaborateur C3 = new consultant(3 , "Ben Cherif", 80 , 100);
collaborateur C4 = new consultant(4 , "Ben Mohamed", 70 , 100);
Sinfo1.ajouterCollaborateur(SE1);
Sinfo1.ajouterCollaborateur(SE2);
Sinfo1.ajouterCollaborateur(C1);
Sinfo1.ajouterCollaborateur(C2);
Sinfo1.ajouterCollaborateur(C3);
Sinfo1.ajouterCollaborateur(C4);
System.out.println(Sinfo1);
ArrayList<collaborateur> ColTrie = Sinfo1.triCroissantParcours(5);
System.out.println(ColTrie);

}

    }
