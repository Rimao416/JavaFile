public class cadre extends Employe{
    private int indice;
    public cadre(int indice){
        super();
        this.indice=indice;
    }
    public int GetIndice(){
        return this.indice;
    }
    public double GetSalaire(){
        if(this.indice==1){
            return 13000;
        }else if(this.indice==2){
            return 15000;
        }else if(this.indice==3){
            return 17000;
        }else if(this.indice==4){
            return 20000;
        }else{
            return 0;
        }
    }
}
