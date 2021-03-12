public class fils extends pere {
    public fils(int a,int b){
        super(a, b);
        this.c=100;
    }
    private int c;
    public void affiche(){
        System.out.println(this.a+" "+this.b+" "+this.c);
    }
    
}
