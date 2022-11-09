package aplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

// continuando apartir do UpDowCasting - pegando as classes existentes

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class UpDowCastingAbstract {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);   // troca virgula por ponto 9.)
//		Account acc1 = new Account(1001, "Alex", 1000.00); // da erro porque é abastrata
		                                                   // só permite se criar lista
//		Account acc2 = new SavingsAccount(1002,"Maria", 1000.00, 0.01); // nao erro porque não é abastrata
//		Account acc3 = new BusinessAccount(1003, "BOB", 1000.00, 500.00); // nao erro pq não é abastrata
		
		List<Account> list = new ArrayList<>();
		
		list.add(new SavingsAccount(1001, "Alex", 500.00, 0.01));
	    list.add(new BusinessAccount(1002, "Maria", 1000.00, 400.00));
	    list.add(new SavingsAccount(1004, "Bob", 300.00, 0.01));
	    list.add(new BusinessAccount(1005, "Anna", 500.00, 500.00));
	    
	    // soma o saldo teste 1
	    double sum = 0.00;
	    for(Account acc : list) {
	    	sum += acc.getBalance();
	    }
	    
		System.out.printf("Total balance %.2f%n ", sum);
		
		// deposita 10 em cada conta
		for(Account acc : list) {
			acc.deposit(10.0);
			
		}
		sum = 0.00;
		for(Account acc : list) {
			//	System.out.println(acc.getBalance());
				System.out.printf("Updated balance for account %d: %.2f%n", acc.getNumber(), acc.getBalance());
				sum += acc.getBalance();
		}
		System.out.printf("Total balance com depósitos %.2f%n ", sum);
		
	}	
}
