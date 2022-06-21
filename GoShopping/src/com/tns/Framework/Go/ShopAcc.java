package com.tns.Framework.Go;

public abstract class ShopAcc 
{
	private int accNo;					//parameters we want 
	private String accNm;
	private float charges;

   public ShopAcc (int accNo, String accNm,float charges)			//Constructor 
   {
	   this.accNo = accNo;
	   this.accNm = accNm;
	   this.charges = charges;
   }
   
    public void withdraw (float charges)
    {
        System.out.println(charges);
    }
   public void deposite (float charges)
   {
	   System.out.println(charges);
   }
   
   public String getAccNm()
   {
	   return accNm;
   }
   
   public int getAccNo()
   {
	   return accNo;
   }
   
   public float getAccCharges()
   {
	   return charges;
   }
   
   @Override
   public String toString()
   {
	   return String.format("BankAcc[accNo=%s, accNm=%s, accCharges=%s]", accNo, accNm, charges);
   }
}
	
