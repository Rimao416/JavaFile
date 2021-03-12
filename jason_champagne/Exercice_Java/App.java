public class App{
    public static void main(String[] args) {
        Pere P=new Pere("Omari");
        Fils F=new Fils("Dido");
     //   P.Affiche();
        P.Identite("Congolaise", "5412556", 15);
        F.Identite("Gabonnaise", "9876543", 20);
        P.Affiche();
        F.Affiche();
        F.Enplus("Je fais pipi aux habits");
    }
}