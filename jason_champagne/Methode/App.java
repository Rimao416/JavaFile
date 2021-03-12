
public class App{
    //Avantages des methodes
    /* 
        1) La répétition de code: Les méthodes permettent à ce qu'on ne puise plus répéter notre code
    Si on a des choses qui se répètent dans notre programme, c'est mieux de mettre ça dans une méthode
    */
    public static void main(String[] args) {
        Player p1=new Player("Merveille",45);
        Player p2=new Player("Omari",45);
        Player p3=new Player("Dido",123);
        System.out.println(p1.Concat(p2)); 
        
    }

}