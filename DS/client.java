public class client {
    private String nom;
    private int credit;
    public client(String Name, int credit){
        this.nom=Name;
        this.credit=credit;
    }
    public String getName(){
        return this.nom;
    }
    public int getCredit(){
        return this.credit;
    }
    public void setName(String N){
        this.nom=N;
    }
    public void setCredit(int C){
        this.credit=C;
    }
    
}
