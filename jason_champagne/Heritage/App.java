public class App {
    public static void main(String[] args) {
        System.out.println("Salut la jeunesse");
        Horse h=new Horse("Salut");
        h.move(150,200);
        Horse y=new Horse("Je suis vivant");
        y.move(150,150);
        //h.surpasse(y);
        Pegasus p=new Pegasus("Sparte");
        p.fly(150);

    }
}
