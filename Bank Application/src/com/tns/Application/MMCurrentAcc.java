package com.tns.Application;
import com.tns.Framework.CurrentAcc;

public class MMCurrentAcc extends CurrentAcc
{
	
	public MMCurrentAcc(int accNo, String accNm, float accBal, float creditLimit) 
	{
		super(accNo, accNm, accBal, creditLimit);
	}

	@Override
	public String toString() {
		return "MMCurrentAcc [toString()=" + super.toString() + ", getAccNm()=" + getAccNm() + ", getAccNo()="
				+ getAccNo() + ", getAccBal()=" + getAccBal() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}
	
	
	/*public void withdraw (float accBal)
	{
		System.out.println("Account Bal is "+accBal);
	}*/
//	@Override
//	public String toString() {
//		return String.format("MMCurrentAcc [toString = %s])", toString());
//	}
	
}
