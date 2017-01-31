import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class STOCKMERCHANT {

    public static void main(String[] args) {
        int n = 78;
        int c[] = {24, 29 ,70 ,43 ,12 ,27 ,29 ,24 ,41 ,12 ,41, 43 ,24 ,70 ,24 ,100 ,41 ,43 ,43 ,100 ,29 ,70 ,100 ,43 ,41 ,27 ,70 ,70 ,59 ,41 ,24 ,24 ,29 ,43 ,24 ,27 ,70 ,24 ,27 ,70 ,24 ,70 ,27 ,24 ,43 ,27 ,100 ,41 ,12 ,70 ,43 ,70 ,62 ,12 ,59 ,29, 62 ,41 ,100 ,43 ,43 ,59 ,59 ,70, 12 ,27 ,43 ,43 ,27 ,27 ,27 ,24 ,43 ,43 ,62, 43 ,70 ,29};
        HashMap<Integer,Integer> hm= new HashMap<Integer,Integer>();
        HashMap<Integer,Integer> hm1= new HashMap<Integer,Integer>();
        for(int i=0;i<n;++i){
            hm.put(c[i],c[i]);
        }
        int count=0;
      /*
       * 78
	24 29 70 43 12 27 29 24 41 12 41 43 24 70 24 100 41
 43 43 100 29 70 100 43 41 27 70 70 59 41 24 24 29 43 
 24 27 70 24 27 70 24 70 27 24 43 27 100 41 12 70 43 
 70 62 12 59 29 62 41 100 43 43 59 59 70 12 27 43 43 27
  27 27 24 43 43 62 43 70 29
       * 
       * expected output=63
       */
       for(int j=0;j<n;++j){ 
    	  int k=0;
      	for(int i=0;i<n;++i){
            if(c[j]==hm.get(c[i])){
            	hm1.put(c[i], ++k);
            }
        }
       }
       //1 3 4 1
       int big=hm1.get(c[0]);
       for(int i : hm1.keySet()){
    	 if(big<hm1.get(i))
    	   big=( hm1.get(i));
       }
       int reject=0;
       for(int i : hm1.keySet()){
      	 if(big!=hm1.get(i))
      	   ++reject;
         }
      
       System.out.println(n-big);
       
    }
}
