package com.tns.Client.Go;

import com.tns.Application.Go.GSShopFactory;
import com.tns.Application.Go.GSNomalAcc;
import com.tns.Application.Go.GSPrimeAcc;
import com.tns.Framework.Go.ShopFactory;
import com.tns.Framework.Go.NormalAcc;
import com.tns.Framework.Go.PrimeAcc;

public class ClientGo {

	public static void main(String[] args)  {
		
		ShopFactory a = new GSShopFactory();
		PrimeAcc b = new GSPrimeAcc( 123,"Jayesh",250,true);
		NormalAcc c = new GSNomalAcc ( 124, "Amit", 300, 10);
		
		System.out.println("Prime Account ");
		b.bookProduct(b.getAccCharges());
		
		System.out.println("Normal Account ");
		b.bookProduct(b.getAccCharges());
		
		System.out.println(a.getNewPrimeAcc(1, "Pranit", 1236, true));
		System.out.println(a.getNewNormalAcc(800, "Darshan", 1000, 50));
		
		System.out.println(b);
		System.out.println(c);

	}

}
