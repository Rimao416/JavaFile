public class Pere{
    protected String fmly;
    protected String Nat;
    protected String Matri;
    protected int age;
    public Pere (String fmly){
        this.fmly=fmly;
    }

    public final void Identite(String Nationalite, String Matricule, int age){
        this.Nat=Nationalite;
        this.Matri=Matricule;
        this.age=age;
    }
    public void Affiche(){
        System.out.println("Identit√© "+this.fmly+" a comme nationalit√© "+this.Nat+" Comme matricule "+this.Matri+" et comme age "+this.age);
    }

}