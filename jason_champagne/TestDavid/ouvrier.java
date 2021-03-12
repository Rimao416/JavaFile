public class ouvrier extends employe{
    //Par rapport, à son annee depuis qu'il est dans l'entreprise
    //Si il a plus de 10 ans dans l'Entreprise, =1500
    //Sinon son salaire =500
    private int anneeEntreprie;
    public ouvrier(int anneeEntreprie){
        super();
        this.anneeEntreprie=anneeEntreprie;
    }
    public double CalculSalaire(){
        if(2020-this.anneeEntreprie>=10){
            return 1500;
        }else{
            return 500;
        }
    }
}
