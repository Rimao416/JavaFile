public class Test {
    public static void main(String[] args) {
        Test T=new Test();
        System.out.println(T.abs(-80));

    }  
    public int abs(int value){
        if(value>=0){
            return value;
        }else{
            return -value;
        }
    }

}
