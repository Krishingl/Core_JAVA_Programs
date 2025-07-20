package com.krushna.arrays_in_java.basic.blc;

public record Trainer(Integer id ,String name , Double salary, Integer experience) implements Comparable<Trainer>//experience in year
{

	@Override
	public int compareTo(Trainer t1) {
		
		return Integer.compare(this.experience(), t1.experience());
	}
	
	
	

}
