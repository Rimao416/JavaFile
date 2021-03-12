public class article{
    private int numero, prix, qte;
    private String nom;
    private article stock[];
    public article(){
        this.numero=0;
        this.prix=0;
        this.qte=0;
        this.nom="";
    }
    public article(int numero, int prix, int qte,String nom){
        this.numero=numero;
        this.prix=prix;
        this.qte=qte;
        this.nom=nom;
    }
    public String GetNom(){
        return this.nom;
    }
    public String toString(){
        return this.nom+" a comme numero "+this.numero+" vaut "+this.prix+" et a comme quantité "+this.qte;
    }
    public void Affiche(){
        System.out.println(toString());
    }
    public boolean equals(article a){
//Les articles sont identifiés par leurs numeros
        return this.numero==a.numero;
    }





}