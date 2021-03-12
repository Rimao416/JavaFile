
public class pere {
    protected int a;
    protected int b;
    public pere(){
        this.a=0;
        this.b=0;
    }
    public pere(int a,int b){
        this.a=a;
        this.b=b;
    }
    public void Seta(int a,int b){
        this.a=a;
        this.b=b;
    }
    public int Get_a(){
        return this.a;
    }
    public int Get_b(){
        return this.b;
    }


}
