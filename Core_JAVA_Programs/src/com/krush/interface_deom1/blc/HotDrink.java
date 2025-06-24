package com.krush.interface_deom1.blc;

public sealed interface HotDrink permits Tea,Coffee,Boost {

	 void  prepare(); //bydefualt its public +abstact
	
	
}
