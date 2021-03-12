public class Horse {
    public Horse(String name)
    {
        this.mName=name;
        this.mPosX=50;
        this.mPosY=50;
    }
    public void move(int x,int y)
    {
        this.mPosX=x;
        this.mPosY=y;
        System.out.println("L'animal se déplace x ="+this.mPosX+" Y= "+this.mPosY+" ");
    }
    protected String mName;
    protected int mPosX;
    protected int mPosY;
}
