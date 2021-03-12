class Exceptions{
public void division()
{
    int x=0;
    System.out.println("...avant division");
    try{
        x=1/x;
    }
    catch(ArithmeticException e){
        System.out.println(e+getClass().getName()+" "+e.getMessage());
    }
    System.out.println("...Après division");
}

public static void main(String[] args) {
    Exceptions op1=new Exceptions();
    System.out.println("<> Debut du programme");
    op1.division();
    System.out.println("<> Fin du programme");   
}
}