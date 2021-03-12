public class voiture{
    private int immatriculation;
    private String marque;
    private int prix;
    private int id_client;

    public voiture(){

    }
    public voiture(int ima, String ma, int prix){
        this.immatriculation=ima;
        this.marque=ma;
        this.prix=prix;
        id_client=0;
    }
    public void setId_client(int c){
        this.id_client=c;
    }
    public int getIdclient(){
        return this.id_client;
    }
    public int getImma(){
        return this.immatriculation;
    }

    public String getMarque(){
        return this.marque;
    }
    public int getprix(){
        return this.prix;
    }
    public void setImma(int m){
        this.immatriculation=m;
    }
    public void setMarque(String ma){
        this.marque=ma;
    }
    public void setPrix(int P){
        this.prix=P;
    }
    public String toString(){
        return "La voiture "+this.immatriculation+" a comme prix "+this.prix+" et comme marque "+this.marque;
    }
    public boolean Equals(voiture v){
        if(v.immatriculation==this.immatriculation && v.marque.equals(this.marque)){
            return true;
        }else{
            return false;
        }
    }
    public void Affichage(){
        System.out.println(toString());
    }
}