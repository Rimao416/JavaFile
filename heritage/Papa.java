package heritage;

public class Papa {
    int x;
    
    public Papa (){
        x=2;
    }
    public Papa (int x){
        this.x=x;
    }
    public int calcul(int a){
        return x*a;
    }
    public String toString(){
        return "x="+x;
    }
}
