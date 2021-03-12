package Attribut;
//Attribut, est une variable qui appartient à une classe
public class Cat {
    String Mname;
    int age;
//Le niveau d'accesibilité de ces éléments sont des Privates
    public Cat(String Name, int age){
        this.Mname=Name;
        this.age=age;
    }
    public void Affiche(){
        System.out.println("Bonjour "+this.Mname+" Miaou "+" Je sais que tu as "+this.age);
    }
}
