public class Lampe {
    private boolean etat;
    public Lampe(boolean etat){
        this.etat=etat;
    }
    public boolean estAllumee(){
        return etat;
    }

    public void presserInterrupteur(){
        etat=!etat;
    }
}
