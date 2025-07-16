package test;
import java.util.Arrays;
import java.util.Scanner;
public class ObjectSorting {
	
	public static void main(String[] args) {
		
		
		
    Object[] obj = {10,"krushna",'j',new Scanner(System.in)};
	
    
     
     Integer[] arrays= {10,20,20,5,2};
     Arrays.sort(arrays);
     System.out.println(Arrays.toString(arrays));
     
          int i=  arrays[3].compareTo(arrays[4]);  //  
          
          System.out.println(i+""+arrays[1].hashCode());
             
         
          
          
	}

}
