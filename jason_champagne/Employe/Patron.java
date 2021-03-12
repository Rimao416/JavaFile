public class Patron extends Employe{
    private int ChiffreAffaire, pourcentage;
    public Patron(int ChiffreAffaire, int pourcentage){
        super();
        this.ChiffreAffaire=ChiffreAffaire;
        this.pourcentage=pourcentage;
    }
    public double GetSalaire(){
        return (this.ChiffreAffaire*this.pourcentage)/100;
    }
    
}
