package heritage;

public class Enfant extends Papa {
    int y;
    
public Enfant()
{
    super();
     y = 3;
}

 

public Enfant (int x, int y)
{
    super(x);
    this.y = y;
}

 

public Enfant (int y)
{
    this(1,y) ;// super(1); this.y = 1;
}

}