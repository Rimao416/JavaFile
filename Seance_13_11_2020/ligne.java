package Seance_13_11_2020;

public class ligne {
    private int nb_segments;
    private segment les_segments;
    public ligne(int n){
        this.nb_segments=n;
        this.les_segments=new segment[n];
    }
    public double longueur(){
        double l=0;
        for(int i=0;i<les_segments.length;i++){
            l=l+les_segments[i].longueur();
        }
    }

}
