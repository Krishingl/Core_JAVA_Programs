package com.krush.interface_deom1.blc;

public sealed interface HotDrink permits Tea,Coffee {

	 void  prepare(); //bydefualt its public +abstact
	
	
}
