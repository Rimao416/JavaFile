public class Test {
    public static void main(String[] args) {
        Point p = new Point (15,4);
    Forme[]f = new Forme[3];
    f[0]= new Cercle(p,17);
    f[1]= new rectangle(p,4,152);
    f[2]= new Cercle(p,146);
    for(int i=0;i<3;i++)
        {
            System.out.println("Périmetre: " + f[i].perimetre());
            System.out.println("Surface : " + f[i].surface());
        }

    }
}
