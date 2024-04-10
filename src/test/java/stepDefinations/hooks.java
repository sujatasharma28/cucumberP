package stepDefinations;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class hooks {
    
	@Before("@NetBanking")
	public void netBankingSetup() {
		 System.out.println("****************************************");
		  System.out.println("Setup the enteries on netbanking page");
	}
	
	@Before("@Mortgage")
    public void mortgageSetup() {
    	System.out.println("Setup the enteries on Mortgage page");
	}
	
	@After
	public void tearDown() {
		System.out.println("Clear the enteries");
		System.out.println("********************************************");
		//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----git key
	}
}
