package cours2;

public class additionTest {
    public int nombre1;
    public int nombre2;
    public additionTest(int nom1,int nomb2){
        this.nombre1=nom1;
        this.nombre2=nomb2;
    }    
    public int addition(int nom1,int nomb2){
        return nom1+nomb2;
    }
    public void AfficheAddition(){
        System.out.println("La somme est "+ nombre1+nombre2);
    }
}
