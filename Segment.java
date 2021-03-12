public class Segment {​​​​


    private Point extr1;

    private Point extr2;


public Segment(Point P , Point Q)

{​​​​

    extr1 = P;

    extr2 = Q;

}​​​​

public Segment(double x1, double y1, double x2, double y2)

{​​​​

    extr1 = new Point(x1 , y1);

    extr2 = new Point(x2 , y2);


}​​​​

public Segment ()

{​​​​

    extr1 = new Point();

    extr2 = new Point(2,5);

}​​​​

public void affiche()

{​​​​

    System.out.println("extr1 : "+extr1.toString());

    System.out.println("extr2 : "+extr2.toString());

}​​​​

}​​​​
