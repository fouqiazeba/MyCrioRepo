package demo;

public class Proc912 {
    public static void main(String[] args) {

        Proc912 m1=new Proc912();
        m1.isPrime(20);

    }

        public String isPrime(int number){
       // number = 35;
        int counter =0;
          String ans ="";
        if(number < 2){
            System.out.println("invalid input...");
            return "invalid";
        }
        for( int i=2;i< number/2;i++){
            if(number % i ==0){
                counter ++;
            }
        }
            if(counter > 2){
                System.out.println("its a composit number"  + number);
                ans = " its a composit " + number;
            }else{
                System.out.println("its a Prime number " + number );
                ans =" its a Prime number" + number;
            }
            return ans;
        }
    }

    

