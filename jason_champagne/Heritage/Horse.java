public class Horse {
    public Horse(String Name){
        this.Mname=Name;
        this.mPosX=50;
        this.mPosY=50;
    }
    public void move(int x,int y){
        this.mPosX=x;
        this.mPosY=y;
        System.out.println("L'animal se deplace x= "+this.mPosX+" y= "+this.mPosY);

    }
    public void surpasse(Horse T){
        this.mPosX+=T.mPosX;
        this.mPosY+=T.mPosY;
        System.out.println("Le deuxième cheval surpasse le premier de "+this.mPosX+" "+this.mPosY);
    }
    protected String Mname;
    protected int mPosX;
    protected int mPosY;
}
