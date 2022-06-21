package com.tns.Framework.Go;

public abstract class ShopFactory 
{
	abstract public PrimeAcc getNewPrimeAcc( int accNo, String accNm, float charges, boolean isPrime);
	
	abstract public NormalAcc getNewNormalAcc (int accNo, String accNm, float charges, float deliveryCharge);
}