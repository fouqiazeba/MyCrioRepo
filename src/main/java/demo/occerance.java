package demo;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class occerance {
    public static void main(String args[]){
  String name= "AGra hello 123  ";
  name= name.toLowerCase();
   
   System.out.println(name);

  Map<Character,Integer> map = new LinkedHashMap<>();
   System.out.println(map+" check the contents of map ");
  char [] cha= name.toCharArray();
  int count=1;

  for(int i=0;i<cha.length;i++){
     if(map.containsKey(cha[i])){
        count++;
        map.put(cha[i],count);

     }else{
        map.put(cha[i],count);   // A-1 g-1 r-1 a-2
        count=1;
     }
 
     
  }
System.out.println(map);


    }



}
