//Cas de figure des animaux vaccinés oui ou non
import java.io.Serializable;

public class Animal implements Serializable{
    private static int nombreAnimal;
    private int age;
    private String couleur;
    private boolean vacciner;
    public Animal(int age, String couleur, boolean vacciner){
        this.age=age;
        this.couleur=couleur;
        this.vacciner=vacciner;
        System.out.println("Un animal a été créer");
        nombreAnimal++;
    }
    public int GetAge(){
        return this.age;
    }
    public String Getcouleur(){
        return this.couleur;
    }
    public boolean GetVacciner(){
        return this.vacciner;
    }
    public void SetAge(int age){
         this.age=age;
    }
    public void SetCouleur(String couleur){
        this.couleur=couleur;
   }
   public void SetVacciner(boolean vacciner){
     this.vacciner=vacciner;
    }
    public String toString(){
        return "Animal age "+this.age+" \n  Couleur "+this.couleur+" \n Vacciner "+this.vacciner;
    }
    public void Affiche(){
        System.out.println(toString());
    }

}
