public class ship extends vehicle implements Flyable {
    public ship(){
        this.mMmovementSpeed=50;
    }
    public void move(int x,int y){
        System.out.println("Le navire se deplace de x ="+x+" y= "+y);   
    }
    public void fly (String energy)
    {
        System.out.println("Je me propulse dans l'air avec une vitesse de "+energy);
    }
}
