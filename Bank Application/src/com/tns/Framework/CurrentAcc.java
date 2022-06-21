package com.tns.Framework;

public abstract class CurrentAcc extends BankAcc
{
	final private float  creditLimit;
	
	public CurrentAcc(int accNo, String accNm, float accBal, float creditLimit)
	{
		super(accNo, accNm, accBal);
		this.creditLimit = creditLimit;
	}
	
	public void withdraw (float accBal)
	{
		System.out.println(" Account No is "+this.getAccNo()+"\n" + " Account Name is "+this.getAccNm()+"\n" + " Account Balance is "+(accBal)+"\n" + "Account Credit Limit is "+creditLimit);
	}

	@Override
	public String toString() {
		return "CurrentAcc [creditLimit=" + creditLimit + ", getAccNm()=" + getAccNm() + ", getAccNo()=" + getAccNo()
				+ ", getAccBal()=" + getAccBal() + ", toString()=" + super.toString() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}
	
	
//	public String toString()
//	{
//		return String.format( "CurrentAcc [creditLimit = %s, toString()=%s]", creditLimit, super.toString());
//	}
}
