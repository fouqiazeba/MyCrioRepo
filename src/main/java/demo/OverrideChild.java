package demo;

public class OverrideChild extends override {
    

   // @Override
    public static int testmethod(){
        int   a=20,b=0;
        System.out.println(a/b);
        double f=1.0;
        double f1=0.0f;
        double f3=f/f1;
        System.out.println(f3);
        a++;
        System.out.println(a);
        return a;
    }
}
