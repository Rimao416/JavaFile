public class cadre extends employe{
    /*
    Si il a 1 comme indice==10000
    Si il a 2 comme indice==20000
    Si il a 3 comme indice==30000
    */
    private int indice;
    public cadre(int indice){
        super();
        this.indice=indice;

    }
    public double CalculSalaire(){
        if(this.indice==1){
            return 10000;
        }else if(this.indice==2){
            return 20000;
        }else{
            return 30000;
        }
    }
}
