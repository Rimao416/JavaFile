package cours1;
import java.util.*;
public class TaskJava{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Entrez votre tache");
        String Titre=sc.nextLine();
        System.out.println("Entrez votre la description");
        String Desc=sc.nextLine();
        Task MaTache=new Task(Titre,Desc);
        MaTache.AfficherLaTache();


    }
}