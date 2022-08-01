package javapg;

        class AtmWithdraw 
        {
        	int amt_withdraw = 2000;
        }
        class Atm extends AtmWithdraw
        {
        int amt_left = 5000;	
        
        public static void main (String[] args)
        {
        	Atm ob1 = new Atm();
        	System.out.println("amt_withdraw=" + ob1.amt_withdraw);
        	System.out.println("amt_left" + ob1.amt_left);
        }
        
        }
