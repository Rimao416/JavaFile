public class CompteEpargne extends CompteBancaire {
    private double solde;
    private double tauxInteret;
    public CompteEpargne(double T){
        super();
        this.tauxInteret=T;
        
    }
    public double getTauxInteret(){
        return this.tauxInteret;
    }
    public void traitementQuotidien(){
        solde=this.GetSolde()+this.GetSolde()*this.tauxInteret;
        System.out.println("SOLDE");
    }
    public String toString(){
        return "LE CLIENT "+this.getNum()+" a un solde de "+solde+" de la mention compte epargne";
    }

}
