package demo;

import java.util.HashMap;

public class Hashmap{
 
String name= "zeba";

 public Hashmap(){


    HashMap <Integer,Integer> hs  = new HashMap<>();
    hs.put(300,1);
    // hs.put(200,1);
    // hs.(300,2);

 }

public void m1(){
 HashMap <Integer,Integer> hs  = new HashMap<>();
    hs.put(300,1);
    // hs.put(200,1);
    // hs.(300,2);
System.out.println(hs);
}
 
{
    //non sattic block 
     HashMap <Integer,Integer> hs  = new HashMap<>();
    hs.put(300,1);
    // hs.put(200,1);
    // hs.(300,2);
}

static 
{
    //static block 
      HashMap <Integer,Integer> hs  = new HashMap<>();
    hs.put(300,1);
    // hs.put(200,1);
    // hs.(300,2);

}

}
