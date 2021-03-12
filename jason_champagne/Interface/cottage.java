public class cottage extends building implements Flyable{
    public cottage(){
        System.out.println("Le materiel est en construction");
    }   
    public void build(String material){
        System.out.println("Le materiel utlisé est "+material);
    }
    public void fly(String energy){
        System.out.println("Je me propulse dans l'air avec une vitesse de "+energy);
    }
}
