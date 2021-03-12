package Exercice_1;
public class TestJava {

    private int x;
    private int y;
    private int z;
    private int w;
     
    public TestJava(){
        x=0;
        y=0;
        y=0;
        w=0;
    }

    public TestJava(int num,int num2,int num3, int num4){
        this.x=num;
        this.y=num2;
        this.z=num3;
        this.w=num4;
    }
    public void SetXY(int a, int b,int c, int d){
        this.x=a;
        this.y=b;
        this.z=c;
        this.w=d;
    }
    public int GetX(){
        return this.x;
    }
    public int GetY(){
        return this.y;
    }
    public int GetZ(){
        return this.z;

    }
    public int GETW(){
        return this.w;
    }
    public String toString()
    {
        return " ( x = "+ x +" ,  y = " + y + " z ="+z+" w = "+w;
    }

    public void Somme(){
        System.out.println(this.y+this.x+this.z+this.w);
    }
    public void SommeMatrice(TestJava T){
        x=this.x+ T.x;
        y=this.y+T.y;
        z=this.z+T.z;
        w=this.w+T.w;
    }


    public void Affiche(){
        System.out.println(toString());
    }
    
}
