public class Etudiant {
    private String nEtudiant, classe;
    private int date;
    public Etudiant(){
        this.nEtudiant="";
        this.classe="";
        this.date=0;
    }
    public Etudiant(String nomEtudiant, String Classe, int date){
        this.nEtudiant=nomEtudiant;
        this.classe=Classe;
        this.date=date;
    }    
    public void SetnEtudiant(String nomEtudiant){
        this.nEtudiant=nomEtudiant;
    }
    public void SetClasse(String Classe){
        this.classe=Classe;
    }
    public void SetDate(int date){
        this.date=date;
    }
    public String GetEtudiant_Name(){
        return this.nEtudiant;
    }
    public String getEtudiant_Classe(){
        return this.classe;
    }
    public int getDate(){
        return this.date;
    }
    public String toString(){
        return "Mr "+this.nEtudiant+" est né en "+this.date+" il est dans la classe "+this.classe;
    }
    public void Affiche(){
        System.out.println(toString());
    }
}
