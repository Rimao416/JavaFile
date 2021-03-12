public class Fils extends Pere{
    private String Enplus;
    public Fils(String fmly){
        super(fmly);
    }
    public void Enplus(String Secret){
        this.Enplus=Secret;
        System.out.println("Et il a comme secret "+this.Enplus);
    }    


}
