package heritage;

public class Test1 {
    public static void main(String[] args) {
        Papa p1=new Papa();
        System.out.println(p1);
        Papa p2=new Papa(4);
        System.out.println(p2.calcul(5));
        Enfant E1= new Enfant();
        System.out.println(E1);
        System.out.println(E1.calcul(5));
        Enfant E2=new Enfant(3);
    }
    
}
