package demo;

public class Proc {
    public static void main(String args[]){
     String str="ZY";
     int result =0;
     int d=0;
     for(char ch : str.toCharArray()){
     d= ch -'A'+1;
      result = result * 26 + d;
      System.out.println(result); 
     }
    }
}
