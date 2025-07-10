package com.krush.loose_coupling;

public class PolymorphicBehaviourDemo1 {
	
	
	
	public static void main(String[] args)
	{
		
		
		Animal animal=null;
		animal= new Dog();
		
	checkAnimalType(animal);
		
		
		
	}  
	
	
	public static void checkAnimalType(Animal a)//loose coupling we can pass any sub class of object here.
	{
		
		
		a.roam();   // here because  we cannot call the Dog class specific object if we want call then we should be required tightly coupling means Dog class reference Variable inside 
	}               // have Dog Type Object that means we call the specific properties or functionality of sub class.
            
}


class Animal 
{
	
	
	public void roam() {
		
		
		System.out.println("Generic Animal Is Roaming");
		
	}
}
class Dog extends Animal
{
	@Override
	public void roam()
	{
		System.out.println("Dog Animal Is roaming");
		
		
	}
}
class Lion extends Animal
{
	@Override
	public void roam()
	{
		System.out.println("Lion Animal Is roaming");
		
		
	}
}