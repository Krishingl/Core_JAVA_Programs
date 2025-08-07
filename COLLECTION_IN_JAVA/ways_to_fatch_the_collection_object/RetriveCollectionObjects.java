import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Spliterator;
import java.util.Vector;
public class RetriveCollectionObjects {

	public static void main(String[] args)
	{
		
		
		Vector<String> v= new Vector<>(5,2);
		
		
		v.addElement("Krushna");//jdk 1.0V 
		v.add("Ram");
		v.add("Sham");
		v.add("mahesh");
		v.add("Deepak");
		
		System.out.println("1) By using toString() Overriden method :");
	       System.out.println(v);//[Krushna, Ram, Sham, mahesh, Deepak]
	System.out.println("---------------------------------------------");
		
		System.out.println("2) By using Ordnary For loop :");
		
		for(int i=0;i<v.size();i++)
		{
			System.out.println(v.get(i));
		}
		
		
		System.out.println("---------------------------------------------");
		System.out.println("3) By using  ForEach loop :");
                   for(String u: v)
                   {
                	   System.out.println(u);
                	   
                   }
		
		
		System.out.println("---------------------------------------------");

		
		System.out.println("4) By using Enumeration Interface :");
		
		      Enumeration<String> elements = v.elements();
	
                   while(elements.hasMoreElements())
                   {
                	   System.out.println(elements.nextElement());
                   }
               	
      System.out.println("---------------------------------------------");

           		
      System.out.println("5) By using Iterator Interface :");
           		
		         
		      Iterator<String> itr = v.iterator();
		      
		      
		      while(itr.hasNext()) {
		    	  System.out.println(itr.next());
		      }
		      
		System.out.println("---------------------------------------------");

         		
		 System.out.println("6) By using ListIterator Interface :");
		           		
				         
				      ListIterator<String> listItr = v.listIterator();
				      
				      
				      while(listItr.hasNext()) {
				    	  System.out.println(listItr.next());
				      }
				      
				      while(listItr.hasPrevious())
				      {
				    	  System.out.println(listItr.previous());
				      }
				      
				      System.out.println("---------------------------------------------");

		         		
						 System.out.println("7) By using spliterator() Method  :");
						 
						 
						 Spliterator <String> spliter = v.spliterator();
						           		
								              
				      spliter.forEachRemaining(str->System.out.println(str));
				      
				      System.out.println("---------------------------------------------");

		         		
						 System.out.println("8) By using forEach() Method  :");
						  
				               v.forEach(str->System.out.println(str));
				   System.out.println("---------------------------------------------");

				         		
			     System.out.println("9) By using  Method reference  :");
								  
						               v.forEach(System.out::println);
				 System.out.println("---------------------------------------------");

						         		
				System.out.println("10) By using  stream() method of collection :");
						  								  
				v.stream().forEach(str->System.out.println(str));
						  						  	               
						          
				System.out.println("11) By using  parallelStream() method of collection :");
				  
				v.parallelStream().forEach(str->System.out.println(str));
						  						  	
				      
				      

	}

}
