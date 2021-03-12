package cours1.Exercice_1;
import java.util.*;
public class joueurTest {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        String Jouer=new String();
        System.out.println("Entrez le nom du joueur");
        Jouer=Sc.nextLine();
        joueur Partie1=new joueur(Jouer);
        System.out.println("BIENVENUE "+Partie1.NomJoueur);
        int Nombr; 
        int Nombr2;
        System.out.println("Entrez le premier nombre");
        Nombr=Sc.nextInt();
        System.out.println("Entrez le deuxième nombre");
        Nombr2=Sc.nextInt();
        Partie1.setScore(Nombr,Nombr2);
         Partie1.AfficheGagnant();       
    }
    
}
