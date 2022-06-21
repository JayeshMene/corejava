package com.tns.Application.Go;

import com.tns.Framework.Go.NormalAcc;

public class GSNomalAcc extends NormalAcc
{
	
	public GSNomalAcc(int accNo, String accNm, float charges, float deliveryCharges) 
	{
		super(accNo, accNm, charges, deliveryCharges);
	}

	@Override
	public String toString() {
		return "GSNomalAcc [toString()=" + super.toString() + ", getAccNm()=" + getAccNm() + ", getAccNo()="
				+ getAccNo() + ", getAccCharges()=" + getAccCharges() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}

	
//	@Override
//	public String toString() {
//		return String.format("GSNormalAcc [toString = %s])", toString());
//	}
	
	/*public void withdraw (float accBal)
	{
		System.out.println("Account Bal is "+accBal);
	}*/
	
}

