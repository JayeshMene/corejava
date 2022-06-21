package com.tns.Application;
import com.tns.Framework.SavingAcc;

public class MMSavingAcc extends SavingAcc
{	
	static final private float MINBAL=0.0f;
	
	public MMSavingAcc( int accNo, String accNm, float accBal, boolean isSalaried) 
	{
		super( accNo, accNm, accBal, isSalaried);
	}

	@Override
	public String toString() {
		return "MMSavingAcc [toString()=" + super.toString() + ", getAccNm()=" + getAccNm() + ", getAccNo()="
				+ getAccNo() + ", getAccBal()=" + getAccBal() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}
	
	
	/*public void withdraw (float accBal)
	{
		System.out.println("Account Bal is "+ accBal);
	}*/
	
//	@Override
//	public String toString()
//	{
//		return String.format("MMSavingAcc [toString () = %s]", toString());
//	}
//	
}
