public class Pegasus extends Horse{
    public Pegasus(String name){
        super("Salut");
        this.mPosZ=100;
    }   
    /*
    public void move(int x,int y){
        this.mPosX=x;
        this.mPosY=y;
        System.out.println("Le pegase se déplace de x="+this.mPosX+" y= "+this.mPosY);
    }*/
    public void fly(int z){
        this.mPosZ=z;
        System.out.println("Le pegase s'élève au dessus des airs Z= "+this.mPosZ);
    }

    private int mPosZ;
}
