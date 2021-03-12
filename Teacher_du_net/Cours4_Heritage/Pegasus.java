public class Pegasus extends Horse {

    public Pegasus(String name){
        super(name);
        this.mPosZ=100;
    }
    /*
    public void move(int x, int y){
        this.mPosX=x;
        this.mPosY=y;
        System.out.println("x = "+this.mPosX+" Y= "+this.mPosY);

    }*/ 
    public void fly(int z){
        this.mPosZ=z;
        System.out.println("Le pegase s'eleve dans les airs (Z ="+this.mPosZ+")");
    }
    private int mPosZ;
}
