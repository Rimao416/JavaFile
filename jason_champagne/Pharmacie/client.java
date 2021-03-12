public class client{
    private String Nom;
    private int Credit;
    client Cli[];
    public client(){
        this.Nom="";
        this.Credit=0;
    }
    public client(String Nom, int Credit){
        this.Nom=Nom;
        this.Credit=Credit;
    }
    public String GetName(){
        return this.Nom;
    }
    public int GetCredit(){
        return this.Credit;
    }
    public void Affiche(){
        System.out.println("Le client "+this.Nom+" a comme crédit "+this.Credit);
    }
    public void AchatMed(Medicament e){
        
    }


}