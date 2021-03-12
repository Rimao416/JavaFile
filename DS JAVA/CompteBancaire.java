abstract class CompteBancaire{
    private int numero=0;
    private double solde;
    public CompteBancaire(){
        this.numero=0;
        this.solde=0;
    }
    public CompteBancaire( double solde){
        this.numero++;
        this.solde=solde;
    }    
    public int getNum(){
        return this.numero;
    }
    public double GetSolde(){
        return this.solde;
    }
    public void setNum(int num)
    {
        this.numero=num;
    }
    public void setSolde(double sol){
        this.solde=sol;
    }
    //DEBITER, C'EST RETRIER
  public void debiter(double montant) throws CompteOperationException{
    if (montant> solde) 
    throw new CompteOperationException("vOUS N'AVEZ PAS D'ARGENT");
    else solde=solde-montant;
  }
  public void crediter(double montant){
      this.solde+=montant;

  }
    public abstract void traitementQuotidien();
 }