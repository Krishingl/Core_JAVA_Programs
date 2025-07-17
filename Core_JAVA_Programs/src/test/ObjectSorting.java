package test;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
@SuppressWarnings("unused")
public class ObjectSorting {
	
	public static void main(String[] args) {
		
		
		
    Object[] obj = {10,"krushna",'j',new Scanner(System.in)};
	
    
     
     Integer[] arrays= {10,20,20,5,2};
//     Arrays.sort(arrays);
     System.out.println("Before sort : "+Arrays.toString(arrays));
     
         // int i=  arrays[3].compareTo(arrays[4]);   
   
         Comparable<Integer> compare= null;
         Comparator<Integer> c= (x,y)-> x.compareTo(y);
        
              Arrays.sort(arrays,c);//sorting to call
              System.out.println("After sorting using Caparator Functional Interface : "+Arrays.toString(arrays));
          
          
              
	}

}
