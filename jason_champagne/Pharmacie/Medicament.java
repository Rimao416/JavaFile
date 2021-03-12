public class Medicament {
    private String NomMedicament;
    private double prix;
    private int stock;
    public Medicament(){
        this.NomMedicament="";
        this.prix=0;
        this.stock=0;
    }
    public String GetNameM(){
        return this.NomMedicament;
    }
    public double GetPrix(){
        return this.prix;
    }
    public int stocK(){
        return this.stock;
    }
    public void SetStock(int valeur){
        this.stock=valeur;
    }
    public boolean equals(Medicament e){
        return (this.NomMedicament==e.NomMedicament);
    }

}
