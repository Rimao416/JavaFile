package Exercice_1;
public class Test {
    public static void main(String[] args) {
        TestJava Receive=new TestJava();
        Receive.SetXY(2,5,8,4);
        TestJava Matrice=new TestJava();
        Matrice.SetXY(5, 5, 8, 9);
        Receive.SommeMatrice(Matrice);
        Receive.Affiche();

    }
}
