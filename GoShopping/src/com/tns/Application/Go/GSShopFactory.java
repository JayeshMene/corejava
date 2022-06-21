package com.tns.Application.Go;

import com.tns.Framework.Go.ShopFactory;

public class GSShopFactory extends ShopFactory
{
	public GSPrimeAcc getNewPrimeAcc (int accNo, String accNm, float charges, boolean isPrime)
	{
		GSPrimeAcc b = new GSPrimeAcc (accNo,accNm,charges,isPrime);
		return b;
	}
	
	public GSNomalAcc getNewNormalAcc(int accNo, String accNm, float charges, float deliveryCharges)
	{
		GSNomalAcc c = new GSNomalAcc (accNo, accNm, charges,deliveryCharges);
		return c;
	}
}
