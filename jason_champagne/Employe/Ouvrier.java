public class Ouvrier extends Employe{
    private int DateEntree;
    private final int SMIGH=2500;
    private final int AnneeActuelle=2020;
    public Ouvrier(int DateE){
        super();
        this.DateEntree=DateE;
    }
    public double GetSalaire(){
        return SMIGH+(AnneeActuelle-this.DateEntree)*100;
    }
}
