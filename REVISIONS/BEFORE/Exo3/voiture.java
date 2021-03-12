public class voiture{
    private int immatriculation, prix;
    private String Marque;

    public voiture(){
        this.immatriculation=0;
        this.prix=0;
        this.Marque="";
    }
    public voiture(int imma, int prix, String Marque){
        this.immatriculation=imma;
        this.prix=prix;
        this.Marque=Marque;
    }
    public int GetImma(){
        return this.immatriculation;
    }
    public int GetPrix(){
        return this.prix;
    }
    public String GetMarque(){
        return this.Marque;
    }
    public void equals(voiture v){
        if((this.immatriculation==v.immatriculation)&&(this.Marque==v.Marque)){
            System.out.println("ELLES SONT IDENTIQUES");
        }
    }
}