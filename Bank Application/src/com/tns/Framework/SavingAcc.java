package com.tns.Framework;

public abstract class SavingAcc extends BankAcc 
{
	private boolean isSalaried;
	static final private float MINBAL=0.0f;
	
	public SavingAcc( int accNo, String accNm, float accBal, boolean isSalaried)
	{
		super(accNo, accNm, accBal);
		this.isSalaried = isSalaried;
	}
	
	public void withdraw (float accBal)
	{
		System.out.println(" Account No is " +this.getAccNo()+"\n" + " Account Name is "+this.getAccNm()+"\n" + " Account Bal is "+this.getAccBal());
	}

	@Override
	public String toString() {
		return "SavingAcc [isSalaried=" + isSalaried + ", getAccNm()=" + getAccNm() + ", getAccNo()=" + getAccNo()
				+ ", getAccBal()=" + getAccBal() + ", toString()=" + super.toString() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}

	
//	@Override
//	public String toString() 
//	{
//		return String.format("SavingAcc [isSalaried = %s, toString() = %s]", isSalaried,
//				super.toString());
//	}
//	
}
