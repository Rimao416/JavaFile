public class SalarieEntreprise extends collaborateur{
    public double CalculCoutProjet(int n){
        return (n*this.GetCout());
    }    
    private String Grade;
    public String getGrade() {
        return Grade;
    }

     public void setGrade(String grade) {
        Grade = grade;
        }

     public SalarieEntreprise(int matricule, String nom, double coutjournalier, String Grade) {
            super(matricule, nom, coutjournalier);
            this.Grade = Grade;
// TODO Auto-generated constructor stub
}


    public String toString() {
        return "SalarieEntreprise [Grade = " + Grade + " , toString() = " + super.toString() +"]";
    }
    public void affiche()
    {
        System.out.println(toString());
        System.out.println("Le coût de projet pour 10: " + CalculCoutProjet(10));
    }









}
