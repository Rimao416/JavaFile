import java.util.Random;
public class SoftwareRegistry{
    //Les accesseurs sont les Get et Set en Java, nous les avons déjà appris mais bon...
    //Getters: accès à un attribut
    //Setters: Modification à un attribut
    public SoftwareRegistry(int expiration){
        this.mExpirationYear=expiration;
    }
    private int mExpirationYear;
    public void Affiche(){
        System.out.println("Votre produit expire le "+this.mExpirationYear);
    }
    public void Set(int nouveau){
        this.mExpirationYear=nouveau;
    }
    public int Aleatoire(int nouveau){
        Random dice=new Random();
        return dice.nextInt(200);
    }

}