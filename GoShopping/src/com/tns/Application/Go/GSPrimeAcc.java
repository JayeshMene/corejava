package com.tns.Application.Go;

import com.tns.Framework.Go.PrimeAcc;

public class GSPrimeAcc extends PrimeAcc
{	
	static final private float deliveryCharges=0.0f;
	
	public GSPrimeAcc( int accNo, String accNm, float charges, boolean isPrime) 
	{
		super( accNo, accNm, charges, isPrime);
	}

	@Override
	public String toString() {
		return "GSPrimeAcc [toString()=" + super.toString() + ", getAccNm()=" + getAccNm() + ", getAccNo()="
				+ getAccNo() + ", getAccCharges()=" + getAccCharges() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}

//	@Override
//	public String toString() {
//		return String.format("GSPrimeAcc [toString = %s])", toString());
//	}
//	
	
	
	/*public void withdraw (float accBal)
	{
		System.out.println("Account Bal is "+ accBal);
	}*/
	
	//return String.format("GSNormalAcc [toString = %s])", toString());
	
}
