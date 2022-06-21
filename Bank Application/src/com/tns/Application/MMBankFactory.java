package com.tns.Application;
import com.tns.Framework.*;

public class MMBankFactory extends BankFactory
{
	public MMSavingAcc getNewSavingAcc (int accNo, String accNm, float accBal, boolean isSalaried)
	{
		MMSavingAcc p = new MMSavingAcc (accNo,accNm,accBal,isSalaried);
		return p;
	}
	
	public MMCurrentAcc getNewCurrentAcc(int accNo, String accNm, float accBal, float creditLimit)
	{
		MMCurrentAcc n = new MMCurrentAcc (accNo, accNm, accBal,creditLimit);
		return n;
	}
}
