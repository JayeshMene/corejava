package com.tns.Framework.Go;


public abstract class PrimeAcc extends ShopAcc 
{
	private boolean isPrime;
	static final private float deliveryCharges = 0.0f;
	
	public PrimeAcc( int accNo, String accNm, float charges, boolean isPrime)
	{
		super(accNo, accNm, charges);
		this.isPrime = isPrime;
	}
	
	public void bookProduct (float charges)
	{
		System.out.println(" Account No is " +this.getAccNo()+"\n" + " Account Name is "+this.getAccNm()+"\n" + " Account charges is "+this.getAccCharges());
	}

	@Override
	public String toString() {
		return "PrimeAcc [isPrime=" + isPrime + ", getAccNm()=" + getAccNm() + ", getAccNo()=" + getAccNo()
				+ ", getAccCharges()=" + getAccCharges() + ", toString()=" + super.toString() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + "]";
	}

	
//	@Override
//	public String toString() 
//	{
//		return String.format("PrimeAcc [isPrime = %s, toString() = %s]", isPrime,
//				super.toString());
//	}
//	
}
