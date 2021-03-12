public class CompteCourant extends CompteBancaire {
    private double tauxAgios;
    private double solde;
    public CompteCourant(double Taux){
        super();
        this.tauxAgios=Taux;
        solde=super.GetSolde();
    }
    public double getTauxAgios(){
        return this.tauxAgios;
    }
    public void setTauxAgios(double T){
        this.tauxAgios=T;
    }
    public void traitementQuotidien(){
        System.out.println("Taux d'Agios ="+solde*this.getTauxAgios());
    }
    public String toString(){
        return "Le Numéro "+this.getNum()+" a un solde de "+solde;
    }
}
