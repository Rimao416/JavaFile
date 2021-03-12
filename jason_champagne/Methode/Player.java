public class Player {
    public Player(){

    }
    public static int compteur=0;
    public String Name;
    public int age;
    public Player(String Name, int age){
        this.Name=Name;
        this.age=age;
        compteur++;
    }
    public void Affiche(){
        System.out.println("Tu es Omari");
    }
    public String Concat(Player h){
        return "Bonjour"+this.Name+" je vois que tu es ami avec "+h.Name;
    }

}
