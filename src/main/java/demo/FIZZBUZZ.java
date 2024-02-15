package demo;


/**CRIO_SOLUTION_START_MODULE_L1_PROBLEMS
		String [] result=new String[n];
		for(int i=1;i<=n;i++)
		{
			if(i%3==0 && i%5==0)
				result[i-1]="FizzBuzz";
			else if(i%3==0)
				result[i-1]="Fizz";
			else if(i%5==0)
				result[i-1]="Buzz";
			else
				result[i-1]=Integer.toString(i);
		}
		return result; */
public class FIZZBUZZ {
  public static String [] fizzBuzz(int n) {
       
       String [] arr=new String [n];
         for(int i=1;i <=n ; i++){
             if((i % 3==0) && (i % 5==0) ){
               arr[i-1] = "FizzBuzz";
             }else if(i % 3 == 0){
               arr[i-1] = "Fizz";
             }else if(i % 5 ==0){
            arr[i-1] = "Buzz";
             }else {
                 System.out.println(i);
             }
            return arr;
         }
      //  return arr;
        return arr;
         
    }
}

