package com.tns.Framework;

public abstract class BankAcc 
{
	private int accNo;					//parameters we want 
	private String accNm;
	private float accBal;

   public BankAcc (int accNo, String accNm,float accBal)			//Constructor 
   {
	   this.accNo = accNo;
	   this.accNm = accNm;
	   this.accBal = accBal;
   }
   
    public void withdraw (float accBal)
    {
        System.out.println(accBal);
    }
   public void deposite (float accBal)
   {
	   System.out.println(accBal);
   }
   
   public String getAccNm()
   {
	   return accNm;
   }
   
   public int getAccNo()
   {
	   return accNo;
   }
   
   public float getAccBal()
   {
	   return accBal;
   }
   
   @Override
   public String toString()
   {
	   return String.format("BankAcc[accNo=%s, accNm=%s, accBal=%s]", accNo, accNm, accBal);
   }
}
	


