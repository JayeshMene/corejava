package com.tns.client;
import com.tns.Application.MMCurrentAcc;
import com.tns.Application.MMSavingAcc;
import com.tns.Application.MMBankFactory;
import com.tns.Framework.BankFactory;
import com.tns.Framework.CurrentAcc;
import com.tns.Framework.SavingAcc;

public class Client {

	public static void main(String[] args) throws Exception {
		
		BankFactory s = new MMBankFactory();
		SavingAcc p = new MMSavingAcc( 123,"Jayesh",250,true);
		CurrentAcc n = new MMCurrentAcc ( 124, "Amit", 300, 10);
		
		System.out.println("Saving Account ");
		p.withdraw(p.getAccBal());
		
		System.out.println("Current Account ");
		n.withdraw(n.getAccBal());
		
		System.out.println(s.getNewSavingAcc(1, "Pranit", 1236, true));
		System.out.println(s.getNewCurrentAcc(800, "Darshan", 1000, 50));
		
		System.out.println(p);
		System.out.println(n);

	}

}
