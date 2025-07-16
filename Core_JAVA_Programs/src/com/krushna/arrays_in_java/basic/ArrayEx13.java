package com.krushna.arrays_in_java.basic;
//Create Book class Object to access the book class properties book array index.

class Book
{   
	String tittle;
	String author;
	Book()
	{
		
	}
	
}

public class ArrayEx13
{

	public static void main(String[] args)
	{
		        Book [] books = new Book[3];
		        books[0]= new Book();
		        books[1]= new Book();
		        books[2]= new Book();
		        
		        //Intializing the book class Properties by using index
		        books[0].tittle="java";
		        books[0].author="James Gosling";
		        
		        books[1].tittle="C laguage";
		        books[1].author="Denis Ritchi";
		        
		        books[2].tittle="HTML";
		        books[2].author="Tem Berners Lee";
		        
		        
		        int index =0;
		        
		        while(index < books.length)
		        {
		        	System.out.println(books[index].tittle+" by "+books[index].tittle);
		        	index++;
		        }
		        
	}
}
