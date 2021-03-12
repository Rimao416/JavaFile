public class consultant extends collaborateur{
    public consultant(int matricule, String nom,double coutJournalier,double coutP){
        super(matricule,nom,coutJournalier);
        this.coutProjetForfaitaire=coutP;
    }
    private double coutProjetForfaitaire;
    
    public double CalculCoutProjet(int n){
        return (n* this.GetCout()+this.coutProjetForfaitaire);
    }    
    public String toString(){
        return "Consultant ["+super.toString()+" cout projet forfaitaire "+coutProjetForfaitaire+" ]";
    }

}
