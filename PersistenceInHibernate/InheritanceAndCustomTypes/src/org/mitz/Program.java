package org.mitz;

import java.util.ArrayList;
import java.util.List;

import org.mitz.dao.BankAccountDao;
import org.mitz.dao.BillingDetailDao;
import org.mitz.dao.CreditCardDao;
import org.mitz.model.BankAccount;
import org.mitz.model.BillingDetails;
import org.mitz.model.CreditCard;

public class Program {
	public static List<BankAccount> bankAccounts = new ArrayList<BankAccount>();
	public static List<CreditCard> creditCards = new ArrayList<CreditCard>();
	public static List<BillingDetails> billingDetails = new ArrayList<BillingDetails>();
	
	static {
		BankAccount acc = new BankAccount();
		acc.setOwner("OWNER1");
		acc.setAccount("101010");
		acc.setBankname("BANKNAME1");
		acc.setSwift("SWIFT1");
		
		bankAccounts.add(acc);
		
		acc = new BankAccount();
		acc.setOwner("OWNER2");
		acc.setAccount("202020");
		acc.setBankname("BANKNAME2");
		acc.setSwift("SWIFT2");
		
		bankAccounts.add(acc);
		
		CreditCard cc = new CreditCard();
		cc.setOwner("OWNER3");
		cc.setNumber("CC1");
		cc.setExpMonth("m1");
		cc.setExpYear("Y1");
		creditCards.add(cc);
		
		cc = new CreditCard();
		cc.setOwner("OWNER4");
		cc.setNumber("CC2");
		cc.setExpMonth("m2");
		cc.setExpYear("Y2");
		
		creditCards.add(cc);
		
		BillingDetails billDetail = new BillingDetails();
		billDetail.setOwner("OWNER5");
		
		billingDetails.add(billDetail);
		
		billDetail = new BillingDetails();
		billDetail.setOwner("OWNER6");
		
		billingDetails.add(billDetail);
	}

	public static void main(String[] args) {
		BankAccountDao accountDao = new BankAccountDao();
		CreditCardDao cardDao = new CreditCardDao();
		BillingDetailDao billDetailDao = new BillingDetailDao();
		
		for(BankAccount acc: bankAccounts){
			accountDao.create(acc);
			System.out.println("Account Id: " + acc.getId());
		}
		
		for(CreditCard card: creditCards){
			cardDao.create(card);
			System.out.println("Card Id: " + card.getId());
		}
		
		for(BillingDetails billDetail: billingDetails){
			billDetailDao.create(billDetail);
			System.out.println("Bill Detail Id: " + billDetail.getId());
		}
		
		System.out.println(accountDao.retrive(2L));
		System.out.println(cardDao.retrive(4L));
		System.out.println(billDetailDao.retrive(6L));
	}
}

